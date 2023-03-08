import java.util.Scanner;

//1334
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[s.length()];
		boolean nine = true;

		// input
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - 48;
			if (arr[i] != 9) {
				nine = false;
			}
		}

		// main
		if (nine) {
			System.out.print(1);
			for (int i = 0; i < s.length()-1; i++) {
				System.out.print(0);
			}
			System.out.print(1);

		} else {
			boolean flag = true;
			int start = s.length() / 2;
			if (s.length() % 2 == 0)
				start--;
			for (int i = start; i >= 0; i--) {
				if (arr[i] < arr[s.length() - i - 1]) {
					flag = true;
					break;
				} else if (arr[i] > arr[s.length() - i - 1]) {
					flag = false;
					break;
				}

			}
			if (flag) {
				for (int i = start; i >= 0; i--) {
					if (arr[i] == 9) {
						arr[i] = arr[s.length() - i - 1] = 0;
					} else {
						arr[i]++;
						arr[s.length() - i - 1] = arr[i];
						break;
					}
				}
			}

			// output
			for (int i = 0; i < s.length() / 2; i++) {
				System.out.print(arr[i]);
			}
			for (int i = start; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		}
	}

}