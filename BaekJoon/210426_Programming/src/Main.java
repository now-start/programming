import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		System.out.println(solution(a, b, c));
	}

	// 제귀 함수 곱하기시 4byte, 8byte 범위를 벗어날수 있으므로 조심
	private static long solution(long a, long b, long c) {
		if (b == 1) {
			return a % c;
		} else if (b % 2 == 0) {
			long temp = solution(a, b / 2, c);
			return temp * temp % c;
		} else {
			long temp = solution(a, (b - 1), c);
			return temp * a % c;
		}
	}
}
