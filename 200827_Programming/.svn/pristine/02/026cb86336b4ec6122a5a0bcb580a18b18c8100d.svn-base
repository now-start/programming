import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // testcase

		for (int i = 0; i < t; i++) {
			int h = sc.nextInt(); // hight
			int w = sc.nextInt(); // width
			int n = sc.nextInt(); // number
			int floor = 1;
			int room = 1;

			for (int j = 1; j <= n; j++) {
				if (floor / 100 == h) {
					floor = 1;
					floor += room++;
				}
				floor += 100;
			}

			System.out.println(floor);
		}
	}

}
