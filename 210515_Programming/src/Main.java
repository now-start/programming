import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// nCm = n!/m!(n-m)!
		// 100!/6!(100-6)! = 100!/6!94! = 100 * ... * 95 / 6 * ... * 1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		BigInteger temp1 = BigInteger.ONE;
		BigInteger temp2 = BigInteger.ONE;

		for (int i = 0; i < m; i++) {
			temp1 = temp1.multiply(BigInteger.valueOf(n - i));
			temp2 = temp2.multiply(BigInteger.valueOf(i + 1));
		}

		System.out.println(temp1.divide(temp2));
	}

}
