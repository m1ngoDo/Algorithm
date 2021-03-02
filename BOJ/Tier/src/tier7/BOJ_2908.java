package tier7;

import java.util.Scanner;

public class BOJ_2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		x = x/100 + (x/10 % 10)*10 + (x % 10)*100;
		y = y/100 + (y/10 % 10)*10 + (y % 10)*100;
		
		System.out.println(x > y ? x : y);
	}
}
