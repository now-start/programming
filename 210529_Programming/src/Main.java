import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] max_dp = new int[n + 1][3];
		int[][] min_dp = new int[n + 1][3];

		// input
		max_dp[1][0] = min_dp[1][0] = sc.nextInt();
		max_dp[1][1] = min_dp[1][1] = sc.nextInt();
		max_dp[1][2] = min_dp[1][2] = sc.nextInt();

		// main
		for (int i = 2; i <= n; i++) {
			int[] num = new int[3];
			num[0] = sc.nextInt();
			num[1] = sc.nextInt();
			num[2] = sc.nextInt();

			// max
			max_dp[i][0] = Math.max(max_dp[i - 1][0] + num[0], max_dp[i - 1][1] + num[0]);
			max_dp[i][1] = Math.max(max_dp[i - 1][0] + num[1],
					Math.max(max_dp[i - 1][1] + num[1], max_dp[i - 1][2] + num[1]));
			max_dp[i][2] = Math.max(max_dp[i - 1][1] + num[2], max_dp[i - 1][2] + num[2]);

			// min
			min_dp[i][0] = Math.min(min_dp[i - 1][0] + num[0], min_dp[i - 1][1] + num[0]);
			min_dp[i][1] = Math.min(min_dp[i - 1][0] + num[1],
					Math.min(min_dp[i - 1][1] + num[1], min_dp[i - 1][2] + num[1]));
			min_dp[i][2] = Math.min(min_dp[i - 1][1] + num[2], min_dp[i - 1][2] + num[2]);
		}

		// output
		int max_result = 0;
		int min_result = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			max_result = Math.max(max_result, max_dp[n][i]);
			min_result = Math.min(min_result, min_dp[n][i]);
		}
		System.out.println(max_result + " " + min_result);
	}

}
