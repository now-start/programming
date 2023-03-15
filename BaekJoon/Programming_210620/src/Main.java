import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//16948
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		int[] dx = {-2, -2, 0, 0, 2, 2};
		int[] dy = {-1, 1, -2, 2, -1, 1};
		int[][] map = new int[n][n];
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(r1, c1));
		map[r1][c1] = 1;
		boolean check = true;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			int x = temp.x;
			int y = temp.y;

			if (x == r2 && y == c2) {
				System.out.println(map[x][y] - 1);
				check = false;
			}

			for (int i = 0; i < dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (0 <= nx && nx < n && 0 <= ny && ny < n) {
					if (map[nx][ny] == 0) {
						queue.add(new Point(nx, ny));
						map[nx][ny] = map[x][y] + 1;
					}
				}
			}
		}

		if (check) {
			System.out.println(-1);
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
