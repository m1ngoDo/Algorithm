package week_3;

import java.util.Scanner;

public class BOJ_1174_timeOver {

	public static void main(String[] args) {
		
		int n = new Scanner(System.in).nextInt();
		if(n == 1) {
			System.out.println(0); 
			return;
		}else if(n > 1024) {
			System.out.println(-1); 
			return;
		}
		
		int[] arr = new int[n];
		int num = 0, index = 1, temp;
		int x, y;
		
		A : while(arr[n-1] == 0) {
			num++;
			if(num < 11) {
				arr[index] = num;
				index++;
				continue A;
			}
			temp = num;
			B : while(temp > 10) {
				x = temp/10 % 10;
				y = temp % 10;
				if(x > y) {
					temp = temp/10;
					continue B;
				}
				else continue A;
			}
			arr[index] = num;
			index++;
		}
		
		System.out.println(arr[n-1]);
	}
}
