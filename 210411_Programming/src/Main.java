import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];

		for (int i = 0; i < n; i++) {
			String a = sc.next();
			for (int j = 0; j < n; j++) {
				if (a.charAt(j) == 'R') {
					arr1[i][j] = 1;
					arr2[i][j] = 1;
				} else if (a.charAt(j) == 'G') {
					arr1[i][j] = 2;
					arr2[i][j] = 1;
				} else if (a.charAt(j) == 'B') {
					arr1[i][j] = 3;
					arr2[i][j] = 3;
				}
			}
		}

		System.out.println(BFS(arr1) + " " + BFS(arr2));
	}

	private static int BFS(int[][] arr) {
		int count = 0;
		Queue<Point> queue = new LinkedList<Point>();
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// RGB 판별
				for (int k = 1; k <= 3; k++) {
					if (arr[i][j] == k) {
						count++;
						queue.add(new Point(i, j));
						arr[i][j] = 0;
						while (!queue.isEmpty()) {
							Point temp = queue.poll();
							// 상하좌우
							for (int l = 0; l < dx.length; l++) {
								if (0 <= temp.x + dx[l] && temp.x + dx[l] < arr.length && 0 <= temp.y + dy[l]
										&& temp.y + dy[l] < arr.length && arr[temp.x + dx[l]][temp.y + dy[l]] == k) {
									queue.add(new Point(temp.x + dx[l], temp.y + dy[l]));
									arr[temp.x + dx[l]][temp.y + dy[l]] = 0;
								}
							}
						}
					}
				}
			}
		}

		return count;
	}

}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
