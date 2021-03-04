package week_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1174 {

	static ArrayList<Long> list = new ArrayList<Long>();

	private static void combi(long num, int depth) {
		// 9876543210 10자리
		if (depth > 10) {
			return;
		}

		list.add(num);

		// 1, 10, 2, 20, 21, 210 ...
		for (int i = 0; i < 10; i++) {
			if (num % 10 > i) {
				combi((num * 10) + i, depth + 1);
			}
		}
		return;
	}

	public static void main(String[] args) {

		int n = new Scanner(System.in).nextInt();
		list.add((long) 0); // 1번째가 0이니깐 추가

		// max : 9876543210
		// 총 조합 수 2^10 개 - 1 (공집합)

		if (n <= 11) {
			System.out.println(n - 1);
		} else if (n > 1023) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < 10; i++) {
				combi(i, 1);
			}
			Collections.sort(list);
			System.out.println(list.get(n));
		}
	}
}
