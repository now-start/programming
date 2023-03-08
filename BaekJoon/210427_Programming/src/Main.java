import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][n];
		dp[0][0] = sc.nextInt();

		// main
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				int temp = sc.nextInt();
				if (j == 0) {
					dp[i][j] = temp + dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(temp + dp[i - 1][j - 1], temp + dp[i - 1][j]);
				}
			}
		}

		// output
		int result = 0;
		for (int i : dp[n-1]) {
			result = Math.max(result, i);
		}

		System.out.println(result);
	}

}
