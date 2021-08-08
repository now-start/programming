import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stair = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			stair[i] = sc.nextInt();
		}

		dp[0] = 0;
		dp[1] = stair[1];

		if (n >= 2) {
			dp[2] = stair[2] + stair[1];
		}

		for (int i = 3; i <= n; i++) {
			dp[i] = stair[i] + stair[i - 1] + dp[i - 3] > stair[i] + dp[i - 2] ? stair[i] + stair[i - 1] + dp[i - 3]
					: stair[i] + dp[i - 2];
		}

		System.out.println(dp[n]);
	}

}
