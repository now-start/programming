import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 12852
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		String[] arr = new String[n + 1];

		if (n > 0) {
			dp[1] = 0;
			arr[1] = "1";
		}
		if (n > 1) {
			dp[2] = 1;
			arr[2] = "2 1";
		}
		if (n > 2) {
			dp[3] = 1;
			arr[3] = "3 1";
		}

		for (int i = 4; i <= n; i++) {
			if (i % 6 == 0) {
				if (dp[i / 3] + 1 > dp[i / 2] + 1) {
					if (dp[i / 2] + 1 > dp[i - 1] + 1) {
						dp[i] = dp[i - 1] + 1;
						arr[i] = i + " " + arr[i - 1];
					} else {
						dp[i] = dp[i / 2] + 1;
						arr[i] = i + " " + arr[i / 2];
					}
				} else {
					if (dp[i / 3] + 1 > dp[i - 1] + 1) {
						dp[i] = dp[i - 1] + 1;
						arr[i] = i + " " + arr[i - 1];
					} else {
						dp[i] = dp[i / 3] + 1;
						arr[i] = i + " " + arr[i / 3];
					}
				}
			} else if (i % 3 == 0) {
				if (dp[i / 3] + 1 > dp[i - 1] + 1) {
					dp[i] = dp[i - 1] + 1;
					arr[i] = i + " " + arr[i - 1];
				} else {
					dp[i] = dp[i / 3] + 1;
					arr[i] = i + " " + arr[i / 3];
				}
			} else if (i % 2 == 0) {
				if (dp[i / 2] + 1 > dp[i - 1] + 1) {
					dp[i] = dp[i - 1] + 1;
					arr[i] = i + " " + arr[i - 1];
				} else {
					dp[i] = dp[i / 2] + 1;
					arr[i] = i + " " + arr[i / 2];
				}
			} else {
				dp[i] = dp[i - 1] + 1;
				arr[i] = i + " " + arr[i - 1];
			}
		}

		bw.write(dp[n] + "\n" + arr[n]);
		bw.flush();
	}

}
