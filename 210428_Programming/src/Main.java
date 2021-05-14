import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];

		// input
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// main
		int result = dp[0] = arr[0];

		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(arr[i], arr[i] + dp[i - 1]);
			result = Math.max(result, dp[i]);
		}

		// output
		System.out.println(result);
	}

}
