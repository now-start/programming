import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 8394
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];

		if (n > 0) {
			dp[1] = 1;
		}
		if (n > 1) {
			dp[2] = 2;
		}

		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] % 10 + dp[i - 2] % 10) % 10;
		}

		bw.write(dp[n] + "");
		bw.flush();
	}

}
