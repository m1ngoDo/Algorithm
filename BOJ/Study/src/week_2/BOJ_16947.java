package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_16947 {

	static int n, start;
	static int[] cycle;		// 0 : 방문 x, 1 : 방문, 2 : 순환선
	static int[] answer;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	// 순환선 찾기
	// -2 : cycle 찾지 못함
	// -1 : cycle 찾음 / 해당 노드는 cycle 아님
	// >0 : cycle 시작 노드
	public static int isCycle(int before, int current) {
		if (cycle[current] == 1) return current;	// a : 처음 재방문 노드 = cycle 시작 노드 return
		cycle[current] = 1;
		
		for (int next : list.get(current)) {
			if (before == next) continue;
			int check = isCycle(current, next); 
			if (check == -1) return -1;		
			if (check >= 0) {						// b : a에서 넘어 온 시작 노드로 cycle 판단
				cycle[current] = 2;					
				if (current == check) return -1;	// c : cycle 시작 노드인 경우 나머지 모두 cycle 아님
				else return check;
			}
		}
		return -2;		// 모두 탐색해도 cycle 찾지 못 할 때
	}

	public static void getDist() {
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i = 1; i < cycle.length; i++) {
			if(cycle[i] == 2) {
				if(list.get(i).size() > 2) que.add(i);		// cycle이면서 지선 시작점 queue에 넣어줌
			}
			else answer[i] = -1;							// 지선 표시
		}
		
		while(!que.isEmpty()) {
			int c = que.poll();
			for(int i : list.get(c)) {
				if(answer[i] == -1) {			// 지선이고 거리 계산 안되었을 때
					que.add(i);
					answer[i] = answer[c] + 1;	// 앞 노드 거리 + 1
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		cycle = new int[n+1];
		answer = new int[n+1];
		
		for(int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 1; i < n+1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		if(isCycle(0, 1) == -2) {
			System.out.println("cycle 없음");
			return;
		}
		getDist();
		
		for(int i = 1; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
