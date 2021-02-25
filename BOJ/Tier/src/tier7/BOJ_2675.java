package tier7;

import java.util.Scanner;

public class BOJ_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int r;
		String str;
		while(testCase-- > 0) {
			r = sc.nextInt();
			str = sc.next();
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < r; j++) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
