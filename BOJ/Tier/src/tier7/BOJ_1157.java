package tier7;

import java.util.Scanner;

public class BOJ_1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int[] alpha = new int[26];
		int n, max = -1;
		char answer = '!';
		
		for(int i = 0; i < str.length(); i++) {
			n = str.charAt(i) - 65;
			alpha[n]++;
		}
		
		for(int i : alpha) {
			if(max < i) max = i;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] == max) {
				if(answer == '!') answer = (char) (i + 65);
				else answer = '?';
			}
		}
		System.out.println(answer);
	}
}
