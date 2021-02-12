package week_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14503_2 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int area[][] = new int[n][m];

		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int dr[] = {-1, 0, 1, 0};
		int dc[] = {0, 1, 0, -1};
		
		int x, y;
		boolean check = true;
		int clean = 0;
		int checkCnt = 0;
		
		while(check) {
			area[r][c] = 2;
			clean++;
			while(true) {
				if(checkCnt == 4) {
					x = r - dr[d];
					y = c - dc[d];
					
					if(area[x][y] == 1) {
						check = false; 
						break;
					} else {
						r = x;
						c = y;
						checkCnt = 0; 
					}
				}
				
				d = (d + 3) % 4;
				x = r + dr[d];
				y = c + dc[d];
				
				if(area[x][y] == 0) {
					r = x;
					c = y;
					checkCnt = 0; break;
				} else {
					checkCnt++; continue;
				}
			}
		}
		System.out.println(clean);
	}
}

