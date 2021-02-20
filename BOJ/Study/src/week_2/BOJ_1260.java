package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {

	static boolean[] visited;

	public static void initVisit() {
		for(int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
	}
	
	public static void dfsMatrix(int[][] graph, boolean[] visited, int v) {
		visited[v] = true;
		System.out.print(v + " ");
		
		for(int i = 1; i < graph.length; i++) {
			if(graph[v][i] == 1 && !visited[i]) {		// 연결되어있고 방문하지 않은 경우
				dfsMatrix(graph, visited, i);
			}
		}
	}
	
	public static void dfsList(ArrayList<ArrayList<Integer>> list, boolean[] visited, int v) {
		visited[v] = true;
		System.out.print(v + " ");

		for(int i : list.get(v)) {
			if(!visited[i]) dfsList(list, visited, i);
		}
	}

	public static void bfsMatrix(int[][] graph, boolean[] visited, int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;
		
		while(!queue.isEmpty()) {
			v = queue.poll();
			System.out.print(v + " ");
			
			for(int i = 1; i < graph.length; i++) {
				if(graph[v][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}

	public static void bfsList(ArrayList<ArrayList<Integer>> list, boolean[] visited, int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;

		while(!queue.isEmpty()) {
			v = queue.poll();
			System.out.print(v + " ");
			
			for(int i : list.get(v)) {
				if(!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		// 2차원 배열 선언 _ index 사용하기 위해 +1
		int graph[][] = new int[n+1][n+1];		
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = graph[b][a] = 1;		// 양방향
		}

		// 노드<인접 노드 리스트>
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		// 방문 순서 정렬 
		for (int i = 1; i <= n; i++) { 
			Collections.sort(list.get(i));
		}
		
		br.close();
		
		// 인접 행렬
		dfsMatrix(graph, visited, v);
		System.out.println();
		initVisit();
		bfsMatrix(graph, visited, v);

		System.out.println();
		initVisit();
		
		// 인접 리스트
		dfsList(list, visited, v);
		System.out.println();
		initVisit();
		bfsList(list, visited, v);
	}

}

