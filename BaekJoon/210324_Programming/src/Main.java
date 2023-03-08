import java.util.Scanner;

public class Main {
	static int blue = 0;
	static int white = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		Split(n, 0, 0, arr);

		System.out.println(white + " " + blue);
	}

	private static void Split(int n, int x, int y, int[][] arr) {
		int start = arr[x][y];
		boolean check = false;

		if (n == 1) {
			if (start == 0) {
				white++;
			} else {
				blue++;
			}
		} else {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					if (arr[i][j] != start) {
						check = true;
					}
				}
			}

			if (check) {
				Split(n / 2, x + 0, y + 0, arr);
				Split(n / 2, x + 0, y + n / 2, arr);
				Split(n / 2, x + n / 2, y + 0, arr);
				Split(n / 2, x + n / 2, y + n / 2, arr);
			} else {
				if (start == 0) {
					white++;
				} else {
					blue++;
				}
			}
		}
	}

}
