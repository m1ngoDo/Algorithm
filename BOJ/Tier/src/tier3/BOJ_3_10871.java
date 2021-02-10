package tier3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_3_10871 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int a;
		
		for(int i = 0; i < len; i++) {
			a = Integer.parseInt(st.nextToken());
			if(a < x) {
				bw.append(a + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
