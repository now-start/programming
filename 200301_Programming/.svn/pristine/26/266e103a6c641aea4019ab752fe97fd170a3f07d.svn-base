import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		// 00h 00m 00s ~ 23h 59m 59s
		for (int h = 0; h <= n; h++) {
			for (int m = 0; m <= 59; m++) {
				for (int s = 0; s <= 59; s++) {
					if (h / 10 == k || h % 10 == k) {
						count++;
					} else if (m / 10 == k || m % 10 == k) {
						count++;
					} else if (s / 10 == k || s % 10 == k) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
