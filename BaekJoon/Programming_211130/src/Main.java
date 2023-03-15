import java.io.*;
import java.util.StringTokenizer;

// 2580
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0, 0, arr);
    }

    private static void backTracking(int row, int col, int[][] arr) throws IOException {
        if (col == 9) {
            backTracking(row + 1, 0, arr);
            return;
        }

        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    bw.write(arr[i][j] + " ");
                }
                bw.write("\n");
            }

            bw.flush();
            System.exit(0);
        }

        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isTrue(row, col, i, arr)) {
                    arr[row][col] = i;
                    backTracking(row, col + 1, arr);
                }
            }
            arr[row][col] = 0;
            return;
        }

        backTracking(row, col + 1, arr);
    }

    private static boolean isTrue(int row, int col, int value, int[][] arr) {
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }

        int set_row = (row / 3) * 3;
        int set_col = (col / 3) * 3;

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

}
