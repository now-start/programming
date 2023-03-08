import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

// 2239
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
    static int[][] sudoku = new int[9][9];
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Character.getNumericValue(input.charAt(j));
                if (sudoku[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        backTracking(0);
        bw.flush();
    }

    private static void backTracking(int index) {
        if (list.size() == index) {
            for (int[] i : sudoku) {
                for (int j : i) {
                    out.print(j);
                }
                out.println();
            }
            System.exit(0);
        }

        int x = list.get(index)[0];
        int y = list.get(index)[1];
        boolean[] check = new boolean[10];

        IntStream.range(0, 9).filter(i -> sudoku[x][i] != 0).forEach(i -> check[sudoku[x][i]] = true);
        IntStream.range(0, 9).filter(i -> sudoku[i][y] != 0).forEach(i -> check[sudoku[i][y]] = true);

        int boxX = (x / 3) * 3;
        int boxY = (y / 3) * 3;
        for (int i = boxX; i < boxX + 3; i++) {
            for (int j = boxY; j < boxY + 3; j++) {
                if (sudoku[i][j] != 0) {
                    check[sudoku[i][j]] = true;
                }
            }
        }

        IntStream.range(1, 10).filter(i -> !check[i]).forEach(i -> {
            sudoku[x][y] = i;
            backTracking(index + 1);
            sudoku[x][y] = 0;
        });
    }
}
