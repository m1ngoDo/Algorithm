package tier7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {

	public static boolean check(char[] str) {
		boolean[] check = new boolean[26];
		int prev = 0;
		
		for (int now : str) {
			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				} else return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		char[] str;
		int cnt = 0;

		while (testCase-- > 0) {
			str = br.readLine().toCharArray();
			if(check(str) == true) cnt++;
		}
		br.close();
		
		System.out.println(cnt);
	}
}
