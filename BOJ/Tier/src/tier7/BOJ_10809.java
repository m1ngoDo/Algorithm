package tier7;

import java.util.Scanner;

public class BOJ_10809 {

	public static void main(String[] args) {
		
		char[] str = new Scanner(System.in).next().toCharArray();
		int[] alpha = new int[26];
		int n = 0;
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}
		
		for(int i = 0; i < str.length; i++) {
			n = (int) str[i] - 97;
			if(alpha[n] == -1) alpha[n] = i;
		}
		
		for(int i : alpha) {
			System.out.print(i + " ");
		}
	}
}
