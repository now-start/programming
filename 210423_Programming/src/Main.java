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

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 9) {
					x = i;
					y = j;
				}
			}
		}
		
		BFS(arr, x, y);

	}

	private static void BFS(int[][] arr, int x, int y) {
		int[] dx = { 0, -1, 0, 1 };
		int[] dy = { -1, 0, 1, 0 };
		Queue<Point> queue = new LinkedList<Point>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 9) {
					queue.add(new Point(i, j, 2));
				}
			}
		}

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (temp.size < arr[i][j]) {

					} else if (temp.size == arr[i][j]) {

					} else if (temp.size > arr[i][j]) {

					}
				}
			}
		}
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