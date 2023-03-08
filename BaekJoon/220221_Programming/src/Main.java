import java.io.*;
import java.util.StringTokenizer;

//1010
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        //TC
        while (t-- > 0) {
            //nCr
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());


            int result = combination(n, r);

            bw.write(result + "\n");
            bw.flush();
        }
    }

    private static int combination(int n, int r) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = dp[i][i] = 1;
            if (i > 1) {
                for (int j = 1; j < i; j++) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[n][r];
    }

}
