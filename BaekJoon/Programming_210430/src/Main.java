import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];

        // input
        dp[1] = 1;
        if (n > 1) {
            dp[2] = 1;
        }

        // main
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // output
        System.out.println(dp[n]);
    }

}
