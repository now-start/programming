import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String n2 = sc.next();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += (int) n2.charAt(i)-48;
		}

		System.out.println(sum);
	}

}
