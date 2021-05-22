import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 1;

		while (a < b) {
			if (b % 2 == 0) {
				b /= 2;
			} else if (b % 10 == 1) {
				b /= 10;
			} else {
				break;
			}
			count++;
		}

		System.out.println(a == b ? count : -1);
	}

}
