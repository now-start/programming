import java.util.Scanner;

//1535
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][2];

        // input
        for (int i = 1; i <= n; i++) {
            arr[i][0] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            arr[i][1] = sc.nextInt();
        }

        // main
        int[][] dp = new int[n + 1][101];
        dp[1][100 - arr[1][0]] = arr[1][1];

        for (int i = 2; i <= n; i++) {
            dp[i][100 - arr[i][0]] = arr[i][1];
            for (int j = 100; j > 0; j--) {
                if (j + arr[i][0] <= 100 && dp[i - 1][j + arr[i][0]] != 0) {
                    dp[i][j] = Math.max(dp[i - 1][j + arr[i][0]] + arr[i][1], dp[i - 1][j]);
                } else {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                }
            }
        }

        //output
        int result = 0;
        for (int i = 100; i > 0; i--) {
            result = Math.max(dp[n][i], result);
        }
        System.out.println(result);
    }

}