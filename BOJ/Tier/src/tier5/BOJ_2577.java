package tier5;

import java.util.Scanner;

public class BOJ_2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		char[] abc = String.valueOf(a * b * c).toCharArray();
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < abc.length; j++) {
//				if(abc[j] == Character.forDigit(i, 16)) cnt++;
				if(abc[j] == Integer.toString(i).charAt(0)) cnt++;
			}
			System.out.println(cnt);
			cnt = 0;
		}
	}
}
