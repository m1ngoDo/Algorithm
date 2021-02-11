package week_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1966 {

	static class Prn {
		int index;
		int priority;
		
		public Prn(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st;

		while(test-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int cnt = 1;
			st = new StringTokenizer(br.readLine());
			ArrayList<Prn> list = new ArrayList<Prn>();
			
			for(int i = 0; i < a; i++) {
				list.add(new Prn(i, Integer.parseInt(st.nextToken())));
			}
			
			R: while(!list.isEmpty()) {
				Prn p = list.get(0);
				
				for(Prn prn : list) {
					if(p.priority < prn.priority) {
						list.remove(0);
						list.add(p);
						continue R;
					}
				}
				
				if(p.index == b) break;
				list.remove(0);
				cnt++;
			}
			
			bw.write(cnt + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
