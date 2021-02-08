package tier2;

import java.util.Scanner;

public class BOJ_2_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d %d", b < 45 ? (a < 1 ? a + 23 : a - 1) : a, b < 45 ? b + 15 : b - 45);
	}
}
