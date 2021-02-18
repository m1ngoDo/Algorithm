package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_16947 {

	static int n, start;
	static int[] cycle;		// 0 : �湮 x, 1 : �湮, 2 : ��ȯ��
	static int[] answer;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	// ��ȯ�� ã��
	// -2 : cycle ã�� ����
	// -1 : cycle ã�� / �ش� ���� cycle �ƴ�
	// >0 : cycle ���� ���
	public static int isCycle(int before, int current) {
		if (cycle[current] == 1) return current;	// a : ó�� ��湮 ��� = cycle ���� ��� return
		cycle[current] = 1;
		
		for (int next : list.get(current)) {
			if (before == next) continue;
			int check = isCycle(current, next); 
			if (check == -1) return -1;		
			if (check >= 0) {						// b : a���� �Ѿ� �� ���� ���� cycle �Ǵ�
				cycle[current] = 2;					
				if (current == check) return -1;	// c : cycle ���� ����� ��� ������ ��� cycle �ƴ�
				else return check;
			}
		}
		return -2;		// ��� Ž���ص� cycle ã�� �� �� ��
	}

	public static void getDist() {
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i = 1; i < cycle.length; i++) {
			if(cycle[i] == 2) {
				if(list.get(i).size() > 2) que.add(i);		// cycle�̸鼭 ���� ������ queue�� �־���
			}
			else answer[i] = -1;							// ���� ǥ��
		}
		
		while(!que.isEmpty()) {
			int c = que.poll();
			for(int i : list.get(c)) {
				if(answer[i] == -1) {			// �����̰� �Ÿ� ��� �ȵǾ��� ��
					que.add(i);
					answer[i] = answer[c] + 1;	// �� ��� �Ÿ� + 1
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		cycle = new int[n+1];
		answer = new int[n+1];
		
		for(int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 1; i < n+1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		if(isCycle(0, 1) == -2) {
			System.out.println("cycle ����");
			return;
		}
		getDist();
		
		for(int i = 1; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
