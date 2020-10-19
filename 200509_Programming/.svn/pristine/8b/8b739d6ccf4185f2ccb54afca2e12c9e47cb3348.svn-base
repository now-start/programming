import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		Plus(a, b);
	}

	static void Plus(String a, String b) {
		int n = Math.max(a.length(), b.length()) + 1; // 더하기할때 단위가 증하가는 것을 위해 +1
		int[] x = new int[n];
		int[] y = new int[n];
		int[] carry = new int[n]; // 올림 표현
		int[] result = new int[n]; // 결과 저장

		for (int i = 0; i < a.length(); i++) { // 문자열을 숫자 배열로 만듬
			x[i] = Integer.parseInt(a.substring(a.length() - i - 1, a.length() - i));
		}
		for (int i = 0; i < b.length(); i++) {
			y[i] = Integer.parseInt(b.substring(b.length() - i - 1, b.length() - i));
		}

		for (int i = 0; i < n; i++) {
			if (x[i] + y[i] + carry[i] >= 10) {
				carry[i + 1] = 1;
				result[i] = x[i] + y[i] + carry[i] - 10;
			} else {
				result[i] = x[i] + y[i] + carry[i];
			}
		}

		if (result[n - 1] != 0) {
			System.out.print(result[n - 1]);
		}
		for (int i = n - 2; i >= 0; i--) {
			System.out.print(result[i]);
		}

	}
}
