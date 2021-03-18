package tier8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int day = (v - down) / (up - down);

		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((v - down) % (up - down) != 0) day++;

		System.out.println(day);
	}
}
