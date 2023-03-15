import java.io.*;
import java.util.StringTokenizer;

// 10211
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			// input
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			// main
			int[] dp = new int[n];
			dp[0] = arr[0];
			for (int i = 1; i < n; i++) {
				if (dp[i - 1] + arr[i] > arr[i])
					dp[i] = dp[i - 1] + arr[i];
				else
					dp[i] = arr[i];
			}

			int max = Integer.MIN_VALUE;
			for (int i = 0; i < dp.length; i++) {
				max = Math.max(max, dp[i]);
			}

			bw.write(max + "\n");
		}
		bw.flush();
	}

}
