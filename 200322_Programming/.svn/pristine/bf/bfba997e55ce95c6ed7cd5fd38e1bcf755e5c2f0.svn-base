import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] coin = new int[n + 1];
		int[] d = new int[k + 1];
		int min = -1;

		for (int i = 1; i <= n; i++) {
			coin[i] = sc.nextInt();
		}
		Arrays.fill(d, 1000001);

		for (int i = 1; i <= n; ++i) {
			for (int j = coin[i]; j <= k; ++j) {
				if (j == coin[i]) {
					d[j] = 1;
				} else {
					d[j] = Math.min(d[j], d[j - coin[i]] + 1);
				}
			}
		}
		if (d[k] != 1000001) {
			min = d[k];
		}

		System.out.println(min);
	}
}