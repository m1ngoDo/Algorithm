package tier7;

import java.util.Scanner;

public class BOJ_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		
		System.out.println(sum);
	}
}
