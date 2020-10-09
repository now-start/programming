import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		int sum = 0;
		int count = 1;

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			sum = 0;
			count = 1;
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'O') {
					sum += count++;
				} else {
					count = 1;
				}
			}
			System.out.println(sum);
		}

	}

}
