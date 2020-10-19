import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 장대에 쌓인 원판의 개수

		BigInteger b = new BigInteger("2");
		BigInteger k = b.pow(n).subtract(BigInteger.ONE); // 옮긴 횟수

		System.out.println(k);
		if (n <= 20) {
			Move(n, 1, 2, 3);
		}
	}

	public static void Move(int n, int start, int mid, int end) {
		if (n == 1) {
			System.out.println(start + " " + end);
		} else {
			// n-1 개의 원판을 1에서 2번으로
			Move(n - 1, start, end, mid);
			// n 개의 원판을 1에서 3번으로
			System.out.println(start + " " + end);
			// n-1 개의 원판을 2에서 3번으로
			Move(n - 1, mid, start, end);
		}
	}

}
