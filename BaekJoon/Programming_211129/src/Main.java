import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 2573
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] ice = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				ice[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int count = 0;
		while (true) {
			if (iceCount(ice) >= 2) {
				break;
			} else {
				// 빙하가 다 녹았으면
				if (iceMelt(ice)) {
					count = 0;
					break;
				} else {
					count++;
				}
			}
		}

		bw.write(count + "");
		bw.flush();

	}

	private static int iceCount(int[][] ice) {
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		Queue<Point> queue = new LinkedList<Point>();
		boolean[][] visits = new boolean[ice.length][ice[0].length];
		int count = 0;

		// init
		for (int i = 1; i < ice.length - 1; i++) {
			for (int j = 1; j < ice[i].length - 1; j++) {
				if (ice[i][j] != 0 && !visits[i][j]) {
					queue.add(new Point(i, j));
					visits[i][j] = true;

					// BFS
					while (!queue.isEmpty()) {
						Point temp = queue.poll();
						for (int k = 0; k < 4; k++) {
							int nx = temp.x + dx[k];
							int ny = temp.y + dy[k];

							// 범위 확인
							if (0 <= nx && nx < ice.length && 0 <= ny && ny < ice[0].length) {
								// 방문 확인
								if (!visits[nx][ny] && ice[nx][ny] != 0) {
									queue.add(new Point(nx, ny));
									visits[nx][ny] = true;
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

	private static boolean iceMelt(int[][] ice) {
		// 주변 바다 탐색
		int[][] sea = new int[ice.length][ice[0].length];
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		boolean flag = true;

		for (int i = 1; i < ice.length - 1; i++) {
			for (int j = 1; j < ice[i].length - 1; j++) {
				if (ice[i][j] != 0) {
					int seaCount = 0;
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];

						// 범위 확인
						if (0 <= nx && nx < ice.length && 0 <= ny && ny < ice[0].length) {
							if (ice[nx][ny] == 0) {
								seaCount++;
							}
						}
					}

					sea[i][j] = seaCount;
				}
			}
		}

		// 빙산 녹이기
		for (int i = 1; i < ice.length - 1; i++) {
			for (int j = 1; j < ice[i].length - 1; j++) {
				ice[i][j] = ice[i][j] < sea[i][j] ? 0 : ice[i][j] - sea[i][j];
				if (ice[i][j] != 0) {
					flag = false;
				}
			}
		}

		return flag;
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
