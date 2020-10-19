import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		result(n);
	}

	static void result(int n) {
		int sum = 0; // 분해합
		int i; // 결과값

		for (i = 1; i <= n; i++) {
			sum += i; // 처음 값을 더해준다

			// 각 자리수의 값을 배열에 넣는다
			String tmp = i + "";
			int[] arr = new int[tmp.length()];

			for (int j = 0; j < tmp.length(); j++) {
				arr[j] = Integer.parseInt(tmp.substring(j, j + 1));
			}

			// 각 자리수의 값을 더해준다
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j];
			}

			// 분해합이 입력값과 같으면 for문을 종료한다
			if (sum == n) {
				break;
			} else {
				sum = 0;
			}
		}

		// 분해합과 입력값이 같으면 분해합을 출력하고 다르면 0을 출력한다
		if (sum == n) {
			System.out.println(i);
		} else {
			System.out.println("0");
		}
	}
}
