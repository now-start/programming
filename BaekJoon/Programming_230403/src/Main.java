import java.io.*;
import java.util.StringTokenizer;

import static java.lang.System.in;
import static java.lang.System.out;

//12865
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    static int[][] dp;
    static int[] w;
    static int[] v;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        dp = new int[t + 1][n + 1];
        w = new int[t + 1];
        v = new int[t + 1];

        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            w[i] = a;
            v[i] = b;
        }

        dp();
        out.println(dp[t][n]);
    }

    static void dp() {
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j - w[i] >= 0) dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                else dp[i][j] = dp[i - 1][j];
            }
        }
    }
}
