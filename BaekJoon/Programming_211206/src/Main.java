import java.io.*;
import java.util.Arrays;

// 10422
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int max = arr[t - 1];

        long[] dp = new long[max + 1];
        if (max >= 2) {
            dp[0] = 1;
            dp[2] = 1;
        }

        // main
        for (int i = 2; i <= max / 2; i++) {
            for (int j = 0; j <= i - 1; j++) {
                dp[i * 2] += dp[j * 2] * dp[(i - 1 - j) * 2];
                dp[i * 2] %= 1000000007L;
            }
        }

        for (int i = 0; i < t; i++) {
            bw.write(dp[arr[i]] + "\n");
        }

        bw.flush();
    }

}
