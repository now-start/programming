import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count[] = new int[26];

		for (int i = 0; i < 26; i++) {
			count[i] = -1;
		}

		for (int i = s.length()-1; i >= 0; i--) {
			for (int j = 0; j < 26; j++) {
				if (s.charAt(i) == (j + 97)) {
					count[j] = i;
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(count[i] + " ");
		}
	}

}
