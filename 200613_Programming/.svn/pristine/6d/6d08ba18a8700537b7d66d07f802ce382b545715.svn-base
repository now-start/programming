import java.util.Scanner;

public class Main {
	static int[][] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			fibonacci(arr[i]);
			System.out.println(memo[arr[i]][0] + " " + memo[arr[i]][1]);

		}
	}

	public static void fibonacci(int n) {
		memo = new int[n + 2][2];

		memo[0][0] = 1;
		memo[0][1] = 0;
		memo[1][0] = 0;
		memo[1][1] = 1;

		for (int i = 2; i <= n; i++) {
			memo[i][0] = memo[i - 1][0] + memo[i - 2][0];
			memo[i][1] = memo[i - 1][1] + memo[i - 2][1];
		}
	}
}