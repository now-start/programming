import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // ¿ù(1 <= x <= 12)
		int y = sc.nextInt(); // ÀÏ(1 <= y <= 31)
		int result = 0;

		switch (x) {
		case 12:
			result += 30; // 11
		case 11:
			result += 31; // 10
		case 10:
			result += 30; // 9
		case 9:
			result += 31; // 8
		case 8:
			result += 31; // 7
		case 7:
			result += 30; // 6
		case 6:
			result += 31; // 5
		case 5:
			result += 30; // 4
		case 4:
			result += 31; // 3
		case 3:
			result += 28; // 2
		case 2:
			result += 31; // 1
		case 1:
			break;
		}

		result += y;
		result %= 7;

		switch (result) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
	}

}
