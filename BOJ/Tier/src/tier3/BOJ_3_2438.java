package tier3;

import java.util.Scanner;

public class BOJ_3_2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		StringBuilder sb1 = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder();
//		for(int i = 0; i < a; i++){
//			sb1.append("*");
//			sb2.append(sb1+"\n");
//		}
//		System.out.println(sb2);
	}
}
