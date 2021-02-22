package tier5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_8958 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		char[] str;
		int cnt = 0;
		int answer = 0;
		
		while(test-- > 0) {
			str = br.readLine().toCharArray();
			for(int i = 0; i < str.length; i++) {
				if(str[i] == 'X') cnt = 0;
				else cnt++;
				answer += cnt;
			}
			System.out.println(answer);
			cnt = 0;
			answer = 0;
		}
		br.close();
	}
}
