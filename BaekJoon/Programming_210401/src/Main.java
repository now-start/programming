import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int m, n;
    static int[][] arr;
    // 좌 하 우 상 앞 뒤
    static int[] dx = {-1, 0, 1, 0, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0, 0};
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                arr[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                if (arr[j][k] == 1) {
                    queue.add(new Point(k, j));
                }
            }
        }

        BFS();

        int answer = -1;
        boolean flag = false;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                if (arr[j][k] == 0)
                    flag = true;
                answer = Math.max(answer, arr[j][k]);
            }
        }

        if (answer == 1) {
            System.out.println("0");
        } else if (flag) {
            System.out.println("-1");
        } else {
            System.out.println(answer - 1);
        }
    }

    private static void BFS() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < dx.length; i++) {
                int _x = point.x + dx[i];
                int _y = point.y + dy[i];

                if (_x >= 0 && _y >= 0 && _x < m && _y < n && arr[_y][_x] == 0) {
                    arr[_y][_x] = arr[point.y][point.x] + 1;
                    queue.add(new Point(_x, _y));
                }
            }
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}