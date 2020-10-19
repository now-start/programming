import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BigInteger[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new BigInteger[n + 1];

		if (n > 0) {
			memo[0] = BigInteger.valueOf(0);
			memo[1] = BigInteger.valueOf(1);
		}

		fibo(n);

		System.out.println(memo[n]);
	}

	static void fibo(int n) {
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				memo[i] = memo[i - 2].add(memo[i - 1]);
			}
		}

	}
}