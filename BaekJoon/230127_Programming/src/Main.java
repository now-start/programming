import java.io.*;
import java.util.StringTokenizer;

import static java.lang.System.in;
import static java.lang.System.out;

// 13977
public class Main {
    static final long MOD = 1000000007;
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
    static long[] factorial = new long[4000001];

    public static void main(String[] args) throws IOException {
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * i;
            factorial[i] %= MOD;
        }

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long up = factorial[n];
            long down = factorial[k] * factorial[n - k] % MOD;
            down = pow(down, MOD - 2) % MOD;

            bw.write(up * down % MOD + "\n");
        }
        bw.flush();
    }

    private static long pow(long num, long remain) {
        if (remain == 0) {
            return 1;
        } else if (remain == 1) {
            return num;
        } else if (remain % 2 == 0) {
            long temp = pow(num, remain / 2);
            return (temp * temp) % MOD;
        } else {
            long temp = pow(num, remain - 1);
            return (temp * num) % MOD;
        }
    }
}
