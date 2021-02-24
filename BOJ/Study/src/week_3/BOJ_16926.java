package week_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16926 {

	static int n, m, r;
	static int[][] arr;
	// 시계방향으로 끌어옴 (좌, 상, 우, 하)
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	
	static void arrTurn(int unit) {
		for (int i = 0; i < unit; i++) {
			// 시작 index 왼쪽 맨 위
            int x = i;
            int y = i;
            int temp = arr[x][y];
            int d = 0;
            while (d < 4) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx < i || ny < i || nx >= n - i || ny >= m - i) d++;	// 벽 check
                else {
                	arr[x][y] = arr[nx][ny];
                	x = nx;
                	y = ny;
                }
            }
            arr[i + 1][i] = temp;
        }
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		int unit = Math.min(n, m) / 2;	// 회전 하는 네모 개수
		for (int i = 0; i < r; i++) {
			arrTurn(unit);
        }
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
