import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 2447
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();

        char[][] arr = new char[n][n];

        star(arr, n, 0, 0, false);

        for (char[] i : arr) {
            for (char j : i) {
                bw.write(j);
            }
            bw.write("\n");
        }

        bw.flush();
    }

    private static void star(char[][] arr, int n, int x, int y, boolean flag) {
        if (flag) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int count = 0;
        for (int i = x; i < x + n; i += n / 3) {
            for (int j = y; j < y + n; j += n / 3) {
                count++;
                // 공백 칸일 경우
                star(arr, n / 3, i, j, count == 5);
            }
        }
    }
}
