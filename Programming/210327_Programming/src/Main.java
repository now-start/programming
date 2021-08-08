import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int r = Integer.parseInt(temp[1]);
		int c = Integer.parseInt(temp[2]);

		Z((int) Math.pow(2, n), r, c, 0, 0);
	}

	public static void Z(int n, int r, int c, int x, int y) {
		if (n == 2) {
			if (x == r && y == c) {
				System.out.println(count);
				return;
			}
			count++;

			if (x == r && y + 1 == c) {
				System.out.println(count);
				return;
			}
			count++;

			if (x + 1 == r && y == c) {
				System.out.println(count);
				return;
			}
			count++;

			if (x + 1 == r && y + 1 == c) {
				System.out.println(count);
				return;
			}
		} else {
			if (r < x + n / 2 && c < y + n / 2) {
				Z(n / 2, r, c, x, y);
			}
			count += n / 2 * n / 2;
			if (r < x + n / 2 && c >= y + n / 2) {
				Z(n / 2, r, c, x, y + n / 2);
			}
			count += n / 2 * n / 2;
			if (r >= x + n / 2 && c < y + n / 2) {
				Z(n / 2, r, c, x + n / 2, y);
			}
			count += n / 2 * n / 2;
			if (r >= x + n / 2 && c >= y + n / 2) {
				Z(n / 2, r, c, x + n / 2, y + n / 2);
			}
		}
	}

}
