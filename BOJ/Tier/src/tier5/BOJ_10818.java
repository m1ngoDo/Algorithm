package tier5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_10818 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		while(testCase-- > 0) {
//			list.add(Integer.parseInt(st.nextToken()));
//		}
//		Collections.sort(list);
//		System.out.println(list.get(0) + " " + list.get(list.size()-1));

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int n;
		
		while(testCase-- > 0) {
			n = Integer.parseInt(st.nextToken());
			min = Math.min(min, n);
			max = Math.max(max, n);
		}
		
		System.out.println(min + " " + max);
		br.close();
	}
}
