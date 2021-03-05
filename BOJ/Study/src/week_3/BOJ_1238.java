package week_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1238 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int INF = 10000001;		// 최대 : 1000 * 100000 
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[][] graph = new int[n + 1][n + 1];
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				graph[i][j] = INF;
			}
			graph[i][i] = 0;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			graph[start][end] = cost;
		}

		for (int via = 1; via < n + 1; via++) {				// 경유
			for (int start = 1; start < n + 1; start++) {	// 출발
				for (int end = 1; end < n + 1; end++) {		// 도착
					if (graph[start][end] > graph[start][via] + graph[via][end])
						graph[start][end] = graph[start][via] + graph[via][end];
				}
			}
		}

		int max = 0;
		for (int i = 1; i < n + 1; i++) {
			max = Math.max(max, graph[i][x] + graph[x][i]);
		}
		System.out.println(max);
	}
}