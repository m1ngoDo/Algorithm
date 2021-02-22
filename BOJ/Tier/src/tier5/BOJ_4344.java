package tier5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int person;
		int[] score;
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		StringTokenizer st;
		while(test-- > 0) {
			st = new StringTokenizer(br.readLine());
			person = Integer.parseInt(st.nextToken());
			score = new int[person];
			for(int i = 0; i < person; i++) {
				score[i] = Integer.parseInt(st.nextToken());
				sum += score[i];
			}
			avg = (double)sum / person;
			for(int i = 0; i < person; i++) {
				if(score[i] > avg) cnt++;
			}
			System.out.printf("%2.3f%%\n", Math.round(cnt * 1000000/person) / 10000.0);
			sum = 0;
			avg = 0.0;
			cnt = 0;
		}
		br.close();
	}
}
