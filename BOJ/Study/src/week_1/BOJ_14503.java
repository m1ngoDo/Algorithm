package week_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14503 {
	
	static int r;
	static int c;
	static int d;
	static int[][] area;
	static int checkCnt = 0;
	
	public static int check() {
		
		int check = 0;
		switch (d) {
			case 0:	check = area[r][c-1]; break;
			case 1:	check = area[r-1][c]; break;
			case 2:	check = area[r][c+1]; break;
			case 3:	check = area[r+1][c]; break;
		}
		checkCnt++;
		return check;
	}
	
	public static void turn() {
		
		switch (d) {
			case 0:	d = 3; break;
			case 1:	d = 0; break;
			case 2:	d = 1; break;
			case 3:	d = 2; break;
		}
	}
	
	public static void go() {
		
		switch (d) {
		case 0:	c--; d = 3; break;
		case 1:	r--; d = 0; break;
		case 2:	c++; d = 1; break;
		case 3:	r++; d = 2; break;
		}
	}

	public static void back() {
		
		switch (d) {
		case 0:	r++; break;
		case 1:	c--; break;
		case 2:	r--; break;
		case 3:	c++; break;
		}
	}

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		area = new int[n][m];

		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int run = 0;
		int clean = 0;
		
		RUN1 : while(run < 3) {
			area[r][c] = 2;
			clean++;
			RUN2 : while(checkCnt < 5) {
				if(checkCnt == 4) {
					back();
					if(area[r][c] == 1) {
						run = 3; break;
					}
					checkCnt = 0; continue RUN2;
				}
				if(check() == 0) {
					go(); checkCnt = 0; continue RUN1;
				} else {
					turn(); continue RUN2;
				}
			}
		}
		System.out.println(clean);
	}
}

