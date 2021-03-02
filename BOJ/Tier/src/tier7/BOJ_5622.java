package tier7;

import java.util.Scanner;

public class BOJ_5622 {

	public static void main(String[] args) {
		
		int[] cost = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6,
				7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
		Scanner sc = new Scanner(System.in);
		char[] number = sc.nextLine().toCharArray();
		int answer = 0;
		
		for(int i : number) {
			answer += cost[i-65];
		}
		
		System.out.println(answer);
	}
}
