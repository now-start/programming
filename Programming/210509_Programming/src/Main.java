import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] arr = new int[2][n];

			// input
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// main
			int[][] dp = new int[2][n + 1];
			dp[0][1] = arr[0][0];
			dp[1][1] = arr[1][0];

			for (int i = 2; i < n + 1; i++) {
				dp[0][i] = Math.max(dp[1][i - 1] + arr[0][i - 1],
						Math.max(dp[0][i - 2] + arr[0][i - 1], dp[1][i - 2] + arr[0][i - 1]));
				dp[1][i] = Math.max(dp[0][i - 1] + arr[1][i - 1],
						Math.max(dp[1][i - 2] + arr[1][i - 1], dp[0][i - 2] + arr[1][i - 1]));
			}

			// output
			System.out.println(Math.max(dp[0][n], dp[1][n]));

		}
	}

}
