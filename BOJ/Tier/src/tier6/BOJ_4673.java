package tier6;

public class BOJ_4673 {

	public static int d(int number) {
		int sum = number;

		while (number != 0) {
			sum = sum + (number % 10); // 첫 째 자리수
			number = number / 10; // 10을 나누어 첫 째 자리를 없앤다
		}
		return sum;
	}

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 100001; i++) {
			int n = d(i);

			if (n < 10001) { // 10000 이 넘는 수는 필요가 없음
				check[n] = true;
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (!check[i]) { // false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.print(sb);
	}
}
