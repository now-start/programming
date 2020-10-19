import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int even_count = 0;
			int odd_count = 0;
			String s = "";

			for (int i = 1; i <= n; i++) {
				// 소수의 개수가 2의 배수면 짝수, 아니면 홀수
				if (primeNumber(i) % 2 == 0) {
					even_count++;
				} else {
					odd_count++;
				}
			}

			// 홀수가 짝수보다 많으면 O, 아니면 E를 출력
			if (odd_count > even_count) {
				s = "O";
			} else {
				s = "E";
			}
			
			System.out.println(s);
		}
	}

	// 소수의 개수
	static int primeNumber(int n) {
		int i;
		List<Integer> list = new ArrayList<Integer>();

		if (n < 2)
			return 0;
		while (n != 1) {
			for (i = 2; i <= n; i++) { // 소수 찾기
				if (n % i == 0) {
					break;
				}
			}
			list.add(i);
			n = n / i;
		}

		return list.size();
	}
}
