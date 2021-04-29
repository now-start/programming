import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int x = 0;
		int y = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 9) {
					x = j;
					y = i;
				}
			}
		}

		bw.write(BFS(arr, x, y) + " ");
		bw.flush();
	}

	private static int BFS(int[][] arr, int x, int y) {
		int result = 0;
		int[] dx = { 0, -1, 0, 1 };
		int[] dy = { -1, 0, 1, 0 };
		Queue<Point> queue = new LinkedList<Point>();
		int[][] visit = new int[arr.length][arr.length];
		queue.add(new Point(x, y, 2));
		visit[y][x] = 1;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if(temp.x + dx[i])
				}
			}
		}

		return result;
	}

}

class Point {
	int x;
	int y;
	int size;

	public Point(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}
}