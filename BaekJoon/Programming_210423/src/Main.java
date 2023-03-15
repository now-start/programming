import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int eat_count = 0;
        int size = 2;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 9) {
                    x = i;
                    y = j;
                    arr[i][j] = 0;
                }
            }
        }

        while (true) {
            Point temp = BFS(arr, x, y, size);

            if (temp.x != Integer.MAX_VALUE && temp.y != Integer.MAX_VALUE) {
                result += temp.dist;

                eat_count++;

                if (eat_count == size) {
                    size++;
                    eat_count = 0;
                }

                arr[temp.x][temp.y] = 0;

                x = temp.x;
                y = temp.y;
            } else {
                break;
            }
        }

        System.out.println(result);
    }

    public static Point BFS(int[][] arr, int x, int y, int size) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {-1, 1, 0, 0};
        int min_dist = Integer.MAX_VALUE;
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;
        Queue<Point> queue = new LinkedList<Point>();
        int[][] visits = new int[arr.length][arr.length];
        for (int i = 0; i < visits.length; i++) {
            for (int j = 0; j < visits.length; j++) {
                visits[i][j] = -1;
            }
        }
        visits[x][y] = 0;
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            x = temp.x;
            y = temp.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < arr.length && 0 <= ny && ny < arr.length) {
                    if (visits[nx][ny] == -1 && arr[nx][ny] <= size) {
                        visits[nx][ny] = visits[x][y] + 1;

                        // ���� Ȯ��
                        if (arr[nx][ny] != 0 && arr[nx][ny] < size) {
                            if (visits[nx][ny] < min_dist) {
                                min_x = nx;
                                min_y = ny;
                                min_dist = visits[nx][ny];
                            } else if (min_dist == visits[nx][ny]) {
                                if (min_x == nx) {
                                    if (min_y > ny) {
                                        min_x = nx;
                                        min_y = ny;
                                    }
                                } else if (min_x > nx) {
                                    min_x = nx;
                                    min_y = ny;
                                }
                            }
                        }

                        queue.add(new Point(nx, ny));
                    }
                }
            }
        }

        return new Point(min_x, min_y, min_dist);
    }
}

class Point {
    int x;
    int y;
    int dist;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}