import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2468
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        // input
        int max = 0;
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                max = Math.max(max, temp);
                map[i][j] = temp;
            }
        }

        // main
        int safe = 0;
        for (int i = 0; i <= max; i++) {
            safe = Math.max(safe, solution(i, map));
        }

        // output
        bw.write(safe + "");
        bw.flush();
    }

    private static int solution(int rain, int[][] map) {
        // 깊은 복사 및 침수 지역
        boolean[][] visit = new boolean[map.length][map.length];
        int[][] map_c = new int[map.length][map.length];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map_c[i][j] = map[i][j];
                if (map[i][j] <= rain) {
                    visit[i][j] = true;
                }
            }
        }

        // main
        Queue<Point> queue = new LinkedList<Point>();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (!visit[i][j]) {
                    queue.add(new Point(i, j));
                    visit[i][j] = true;

                    // BFS
                    while (!queue.isEmpty()) {
                        Point temp = queue.poll();
                        int x = temp.x;
                        int y = temp.y;

                        for (int k = 0; k < dx.length; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];

                            if (0 <= nx && nx < map.length && 0 <= ny && ny < map.length) {
                                if (!visit[nx][ny]) {
                                    queue.add(new Point(nx, ny));
                                    visit[nx][ny] = true;
                                }
                            }
                        }
                    }

                    count++;
                }
            }
        }

        return count;
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}