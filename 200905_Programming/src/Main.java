import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		String s[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			s[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				for (int k = 0; k < arr[i]; k++) {
					System.out.print(s[i].charAt(j));
				}
			}
			System.out.println();
		}
	}

}
