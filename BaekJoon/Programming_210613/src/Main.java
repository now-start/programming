import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10164
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        // init
        for (int i = 0; i < m; i++) {
            map[0][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            map[i][0] = 1;
        }

        if (k == 0) {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
                }
            }

            System.out.println(map[n - 1][m - 1]);
        } else {
            int x = k / m - (k % m == 0 ? 1 : 0);
            int y = k - x * m - 1;
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= y; j++) {
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
                }
            }

            // init
            for (int i = y + 1; i < m; i++) {
                map[x][i] = 1;
            }
            for (int i = x + 1; i < n; i++) {
                map[i][y] = 1;
            }
            for (int i = x + 1; i < n; i++) {
                for (int j = y + 1; j < m; j++) {
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
                }
            }

            System.out.println(map[x][y] * map[n - 1][m - 1]);
        }

    }

}
