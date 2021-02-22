package tier5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2562 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int MAX = 1;
		int[] arr = new int[10];
		
		for(int i = 1; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			MAX = Math.max(MAX, arr[i]);
		}
		br.close();
		
		for(int i = 1; i < 10; i++) {
			if(arr[i] == MAX) {
				System.out.println(MAX);
				System.out.println(i);
			}
		}
	}
}
