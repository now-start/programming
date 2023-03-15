import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 18405
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		// main
		for (int i = 0; i < s; i++) {
			for (int j = 1; j <= k; j++) {
				BFS(j, arr);
				if (arr[x - 1][y - 1] != 0) {
					bw.write(arr[x - 1][y - 1] + "");
					bw.flush();
					System.exit(0);
				}
			}
		}

		bw.write(arr[x - 1][y - 1] + "");
		bw.flush();
	}

	private static void BFS(int v, int[][] arr) {
		Queue<Point> queue = new LinkedList<Point>();
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == v) {
					queue.add(new Point(i, j));
				}
			}
		}

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (0 <= nx && nx < arr.length && 0 <= ny && ny < arr.length) {
					if (arr[nx][ny] == 0) {
						arr[nx][ny] = v;
					}
				}
			}
		}
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
