import java.util.Scanner;

public class Main {
	static long x;
	static long y;
	static long z;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextLong();
		y = sc.nextLong();
		z = (y * 100) / x;

		if (z >= 99) {
			System.out.println(-1);
		} else {
			System.out.println(Search(0, x));
		}
	}

	public static long Search(long left, long right) {
		while (left <= right) {
			long mid = (left + right) / 2;
			long temp = ((y + mid) * 100) / (x + mid);
			if (temp > z) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}