import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().trim().toUpperCase();
		int count[] = new int[26];
		int max = 0;
		boolean check = false;

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 65]++;
		}

		for (int i = 1; i < 26; i++) {
			if (count[max] < count[i]) {
				max = i;
				check = false;
			} else if (count[max] == count[i]) {
				check = true;
			}
		}

		if (check) {
			System.out.println("?");
		} else {
			System.out.println((char) (max + 65));
		}
	}

}
