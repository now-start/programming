import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		char[][] map = new char[n][2 * n - 1];

		// input
		for (int i = 0; i < n; i++) {
			Arrays.fill(map[i], ' ');
		}

		// main
		Rule(map, n, 0, n - 1);

		// output
		for (char[] i : map) {
			for (char j : i) {
				bw.write(j);
			}
			bw.write("\n");
		}
		bw.flush();
	}

	static void Rule(char[][] map, int n, int y, int x) {
		String star[] = { "  *  ", " * * ", "*****" };

		if (n == 3) {
			for (int i = y; i < y + 3; i++) {
				for (int j = x - 2; j < x + 3; j++) {
					map[i][j] = star[i - y].charAt(j - (x - 2));
				}
			}
			return;
		}
		Rule(map, n / 2, y, x);
		Rule(map, n / 2, y + (n / 2), x - (n / 2));
		Rule(map, n / 2, y + (n / 2), x + (n / 2));
	}
}