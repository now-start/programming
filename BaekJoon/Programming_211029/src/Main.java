import java.io.*;

// 1904
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());

        // main
        int[] dp = new int[n + 1];
        if (n > 0) {
            dp[1] = 1;
        }
        if (n > 1) {
            dp[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        bw.write(dp[n] + "");
        bw.flush();
    }

}
