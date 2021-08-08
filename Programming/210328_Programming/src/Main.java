import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int[] dp = new int[x + 1];
		
		// 최대값으로 초기화
		for (int i = 1; i < dp.length; ++i) {
			dp[i] = Integer.MAX_VALUE;
		}

		dp[1] = 0;

		if (x > 2) {
			dp[2] = 1;
			dp[3] = 1;
		} else if (x > 1) {
			dp[2] = 1;
		}

		for (int i = 4; i < dp.length; i++) {
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
			}
			dp[i] = Math.min(dp[i - 1] + 1, dp[i]);
		}

		System.out.println(dp[x]);
	}

}
