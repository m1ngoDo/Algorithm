package tier2;

import java.util.Scanner;

public class BOJ_2_14681 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a * b > 0) {
			if (a > 0) System.out.println("1");
			else System.out.println("3");
		} else {
			if (a > 0) System.out.println("4");
			else System.out.println("2");
		}
		//System.out.print(a > 0 ? (b > 0 ? 1 : 4) : (b > 0 ? 2 : 3));
	}
}
