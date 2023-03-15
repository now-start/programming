import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[101];

		for (int i = 0; i < 101; i++) {
			arr[i] = i;
		}

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}

		bw.write(BFS(arr) + " ");
		bw.flush();
	}

	private static int BFS(int[] arr) {
		Queue<Point> queue = new LinkedList<Point>();
		int[] visit = new int[101];
		visit[0] = 1;
		queue.add(new Point(1, 0));

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			for (int i = 1; i <= 6; i++) {
				if (visit[arr[temp.x + i]] == 0) {
					queue.add(new Point(arr[temp.x + i], temp.step + 1));
					visit[arr[temp.x + i]] = 1;
				}
				if (temp.x + i == 100) {
					return temp.step + 1;
				}
			}
		}
		return 0;
	}

}

class Point {
	int x;
	int step;

	Point(int x, int step) {
		this.x = x;
		this.step = step;
	}
}
