import java.util.Scanner;

// 9613
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// 모든 경우의 GCD의 합 구하기
			long sum = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					sum += GCD(arr[i], arr[j]);
				}
			}

			System.out.println(sum);
		}
	}

	public static int GCD(int num1, int num2) {
		if (num2 == 0)
			return num1;
		else
			return GCD(num2, num1 % num2);
	}

}
