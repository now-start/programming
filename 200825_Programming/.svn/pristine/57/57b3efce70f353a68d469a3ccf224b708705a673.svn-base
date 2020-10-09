import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd; // 최대공약수
		int lcm; // 최소공배수

		// 유클리우드 호제법
		if (a >= b) {
			gcd = getGcd(a, b);
		} else {
			gcd = getGcd(b, a);
		}
		lcm = a * b / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}

	public static int getGcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGcd(b, a % b);
	}
}
