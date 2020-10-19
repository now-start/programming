import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// start1(); //점화식
		start2(); // 동적 계획법
	}

	static void start1() { // 점화식
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();
		int[] coin = new int[n + 1];
		int[][] d = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			coin[i] = s.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			d[i][0] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (j >= coin[i])
					d[i][j] = d[i - 1][j] + d[i][j - coin[i]];
				else
					d[i][j] = d[i - 1][j];
			}
		}

		System.out.println(d[n][k]);
	}

	static void start2() { // 동적 계획법
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();
		int[] coin = new int[n + 1];
		int[] d = new int[k + 1];

		for (int i = 1; i <= n; i++) {
			coin[i] = s.nextInt();
		}

		d[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (j >= coin[i])
					d[j] += d[j - coin[i]];
			}
		}

		System.out.println(d[k]);
	}
}
