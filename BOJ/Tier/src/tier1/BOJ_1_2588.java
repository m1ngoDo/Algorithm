package tier1;

import java.util.Scanner;

public class BOJ_1_2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int b100 = b / 100;
		int b10 = b%100 / 10;
		int b1 = b % 10;
		
		System.out.println(a * b1);
		System.out.println(a * b10);
		System.out.println(a * b100);
		//System.out.println((a * b1) + (a * b10)*10 + (a * b100)*100);
		System.out.println(a*b);
	}
}
