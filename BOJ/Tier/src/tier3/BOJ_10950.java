package tier3;

import java.util.Scanner;

public class BOJ_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		for(int i=0; i<len; i++ ) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
}
