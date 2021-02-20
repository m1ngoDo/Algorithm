package tier3;

import java.util.Scanner;

public class BOJ_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++){
			for(int j = 1; j < a-i; j++) {
				System.out.print(" ");
			}
			for(int x = 0; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
