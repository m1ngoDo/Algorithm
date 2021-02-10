package tier3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_3_11021 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int sum;
		
		for(int i = 1; i <= len; i++) {
			st = new StringTokenizer(br.readLine());
			sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + sum);
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
