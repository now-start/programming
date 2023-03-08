import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

//2583
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] map = new int[m][n];
		List<Integer> area = new ArrayList<Integer>();

		// input
		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int y1 = Integer.parseInt(st.nextToken());
			int x1 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());

			// 예제 그림과 같게 만듦
			for (int i = m - x2; i < m - x1; i++) {
				for (int j = y1; j < y2; j++) {
					map[i][j] = -1;
				}
			}
		}

		// main
		int result = DFS(map, area);

		// output
		System.out.println(result);
		Collections.sort(area);
		for (int i = 0; i < area.size(); i++) {
			System.out.print(area.get(i) + " ");
		}
	}

	private static int DFS(int[][] map, List<Integer> area) {
		int result = 0;
		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };
		Queue<Point> queue = new LinkedList<Point>();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					queue.add(new Point(i, j));
					map[i][j] = -1;
					int count = 1;

					while (!queue.isEmpty()) {
						Point temp = queue.poll();
						int x = temp.x;
						int y = temp.y;

						for (int k = 0; k < dx.length; k++) {
							int nx = x + dx[k];
							int ny = y + dy[k];

							if (0 <= nx && nx < map.length && 0 <= ny && ny < map[0].length) {
								if (map[nx][ny] == 0) {
									queue.add(new Point(nx, ny));
									count++;
									map[nx][ny] = -1;
								}
							}
						}
					}

					area.add(count);
					result++;
				}
			}
		}

		return result;
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