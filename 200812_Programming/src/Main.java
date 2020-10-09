import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static String board[];
	static String wAnw[];
	static String bAnw[];
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		board = new String[n];
		wAnw = new String[] { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB",
				"BWBWBWBW", };
		bAnw = new String[] { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
				"WBWBWBWB" };

		for (int i = 0; i < n; i++) {
			board[i] = sc.next();
		}

		for (int i = 0; i <= n - 8; i++) { // 모든 보드판 search
			for (int j = 0; j <= m - 8; j++) {
				search(i, j);
			}
		}

		System.out.println(min);
	}

	public static void search(int a, int b) {
		int wCount = 0;
		int bCount = 0;
		for (int i = a; i < a + 8; i++) {
			for (int j = b; j < b + 8; j++) {
				if (board[i].charAt(j) != wAnw[i - a].charAt(j - b)) {
					wCount++;
				}
				if (board[i].charAt(j) != bAnw[i - a].charAt(j - b)) {
					bCount++;
				}
			}
		}

		min = Math.min(min, Math.min(wCount, bCount));
	}

}
