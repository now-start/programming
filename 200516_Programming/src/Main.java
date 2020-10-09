import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int H;
	static int[][] ladder;
	static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		H = sc.nextInt();
		ladder = new int[H + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			ladder[a][b] = 1;
		}

		DFS(0);
		if (MIN == Integer.MAX_VALUE) {
			MIN = -1;
		}
		System.out.println(MIN);
	}

	public static boolean move() {
		int start;
		int current;

		for (int i = 1; i < N; i++) {
			start = i;
			current = i;

			for (int j = 1; j <= H; j++) {
				if (ladder[j][current] == 1) {
					current++;
				} else if (ladder[j][current - 1] == 1) {
					current--;
				}
			}

			if (start != current) {
				return false;
			}
		}

		return true;
	}

	public static void DFS(int count) {
		if (count == 3) {
			if (move() && MIN > count) {
				MIN = count;
			}
			return;
		}

		if (move()) {
			MIN = count;
			return;
		}

		for (int i = 1; i <= H; i++) {
			for (int j = 1; j < N; j++) {
				if (ladder[i][j] == 0 && ladder[i][j - 1] == 0 && ladder[i][j + 1] == 0) {
					ladder[i][j] = 1;
					count++;
					if (move() && MIN > count) {
						MIN = count;
					} else {
						DFS(count);
					}
					ladder[i][j] = 0;
					count--;
				}

			}
		}
	}
}