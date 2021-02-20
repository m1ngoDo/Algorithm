package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7562 {

	// 시계 방향
	static int[] dr = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int[] dc = {1, 2, 2, 1, -1, -2, -2, -1};
	static int size;
	static boolean[][] visited;
	static Pos start, end;
	
	static class Pos {
		int r, c, cnt;
		public Pos(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}		
	}
	
	static void bfs() {
		visited[start.r][start.c] = true;
		Queue<Pos> que = new LinkedList<Pos>();
		que.add(start);
		
		while(!que.isEmpty()) {
			Pos now = que.poll();
			
			if(end.r == now.r && end.c == now.c) {
				end.cnt = now.cnt;
				return;
			}
			
			for(int i = 0; i < 8; i++) {
				int r = now.r + dr[i];
				int c = now.c + dc[i];
				// boundary & 방문 check
				if(r < 0 || c < 0 || r >= size || c >= size || visited[r][c]) continue;

				visited[r][c] = true;
				que.add(new Pos(r, c, now.cnt+1));
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testcase = Integer.parseInt(br.readLine());
		
		while(testcase-- > 0) {
			size = Integer.parseInt(br.readLine());
			visited = new boolean[size][size];
			st = new StringTokenizer(br.readLine());
			start = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
			st = new StringTokenizer(br.readLine());
			end = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);

			bfs();
			System.out.println(end.cnt);
		}
		br.close();
	}
}
