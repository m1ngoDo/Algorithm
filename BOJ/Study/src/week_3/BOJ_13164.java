package week_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_13164 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int people = Integer.parseInt(st.nextToken());
		int group = Integer.parseInt(st.nextToken());
		
		// 각 그룹의 첫번째와 마지막의 차이 = 인접한 수들의 차이의 합
		// 인접한 수들의 차이를 배열에 넣음
		int[] diff = new int[people - 1];
		st = new StringTokenizer(br.readLine());
		int before = Integer.parseInt(st.nextToken());
		int next;
		while(--people > 0) {
			next = Integer.parseInt(st.nextToken());
			diff[people - 1] = next - before;
			before = next;
		}
		
		// 차이를 정렬해 group-1(group 끼리 인접한 수의 차이)를 빼주고 나머지 더 함
		Arrays.sort(diff);
 		int cost = 0;
		for(int i = 0; i < diff.length - (group - 1); i++) {
			cost += diff[i];
		}
		
		System.out.println(cost);
	}
}
