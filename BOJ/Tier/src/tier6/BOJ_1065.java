package tier6;

import java.util.Scanner;

public class BOJ_1065 {

	static void equalDiff(int n) {
		int cnt = 99;
		int one = 0;
		int ten = 0;
		int hun = 0;
		
		for(int i = 100; i <= n; i++) {
			hun = i / 100;
			ten = (i / 10) % 10;
			one = i % 10;
			if(hun - ten == ten - one) cnt++;
		}
		System.out.print(cnt);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n < 100) {
			System.out.print(n);
			return;
		}
		equalDiff(n);
	}
}
