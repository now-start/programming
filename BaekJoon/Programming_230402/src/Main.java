import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    static String str1;
    static String str2;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        str1 = br.readLine();
        str2 = br.readLine();

        dp = new Integer[str1.length()][str2.length()];

        System.out.println(LCS(str1.length() - 1, str2.length() - 1));

    }

    static int LCS(int x, int y) {

        // 인덱스 밖 (공집합)일 경우 0 반환
        if (x == -1 || y == -1) {
            return 0;
        }

        // 만약 탐색하지 않은 인덱스라면?
        if (dp[x][y] == null) {
            dp[x][y] = 0;

            // str1의 x번째 문자와 str2의 y번째 문자가 같은지 검사
            if (str1.charAt(x) == str2.charAt(y)) {
                dp[x][y] = LCS(x - 1, y - 1) + 1;
            }

            // 같지 않다면 LCS(dp)[x-1][y]와 LCS(dp)[x,y-1] 중 큰 값으로 초기화
            else {
                dp[x][y] = Math.max(LCS(x - 1, y), LCS(x, y - 1));
            }
        }

        return dp[x][y];
    }
}
