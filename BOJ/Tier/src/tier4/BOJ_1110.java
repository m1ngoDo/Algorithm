package tier4;

import java.util.Scanner;

public class BOJ_1110 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		int x = answer, cnt = 0;

		do {
//			y = (x/10 + x%10) >= 10 ? (x/10 + x%10) - 10 : (x/10 + x%10);
//			x = (x%10) * 10 + y;
			x = (x%10) * 10 + ((x/10 + x%10) % 10);
			cnt++;
		} while(answer != x);
		
		System.out.println(cnt);
	}
}
