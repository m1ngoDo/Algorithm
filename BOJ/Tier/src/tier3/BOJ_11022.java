package tier3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_11022 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b, sum;
		
		for(int i = 1; i <= len; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = a + b;
			bw.append("Case #").append(i + ": ").append(a + " + " + b).append(" = " + sum);
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
