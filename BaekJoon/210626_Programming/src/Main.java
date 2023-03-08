import java.util.Scanner;

//15489
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int w = sc.nextInt();

		int[][] map = new int[r + w][r + w];
		map[1][1] = 1;
		map[2][1] = 1;
		map[2][2] = 1;

		for (int i = 3; i < map.length; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 && j == i) {
					map[i][j] = 1;
				} else {
					map[i][j] = map[i - 1][j] + map[i - 1][j - 1];
				}
			}
		}

		int sum = 0;
		int k = 1;
		for (int i = r; i < r + w; i++) {
			for (int j = c; j < c + k; j++) {
				sum += map[i][j];
			}
			k++;
		}

		System.out.println(sum);
	}

}
