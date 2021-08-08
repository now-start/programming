import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(s.charAt(j) + "");
			}
		}

		int result = BFS(map);

		if (result == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}

	private static int BFS(int[][] map) {
		int n = map.length;
		int m = map[0].length;
		int result = Integer.MAX_VALUE;
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		Queue<Point> queue = new LinkedList<Point>();
		// 벽을 부수고 이동한 경우와 부수지 않고 이동한 경우를 구분
		boolean[][][] visits = new boolean[n][m][2];
		queue.add(new Point(0, 0, 1, 0));
		visits[0][0][0] = true;
		visits[0][0][1] = true;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			if (temp.x == n - 1 && temp.y == m - 1) {
				result = temp.dist;
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if (0 <= nx && nx < n && 0 <= ny && ny < m) {
					if (map[nx][ny] == 1 && temp.broken == 0 && !visits[nx][ny][1]) {
						visits[nx][ny][1] = true;
						queue.add(new Point(nx, ny, temp.dist + 1, 1));
					} else if (map[nx][ny] == 0 && !visits[nx][ny][temp.broken]) {
						visits[nx][ny][temp.broken] = true;
						queue.add(new Point(nx, ny, temp.dist + 1, temp.broken));
					}
				}
			}
		}

		return result;
	}

}

class Point {
	int x;
	int y;
	int dist;
	int broken;

	public Point(int x, int y, int dist, int broken) {
		this.x = x;
		this.y = y;
		this.dist = dist;
		this.broken = broken;
	}
}