package tier5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int MAX = 0;
		int sum = 0;
		int n = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < test; i++) {
			n = Integer.parseInt(st.nextToken());
			sum += n;
			if(MAX < n) MAX = n;
		}
		br.close();
		
		double answer = (( (double)sum / MAX) * 100) / test;
		
		System.out.print(answer);
	}
}
