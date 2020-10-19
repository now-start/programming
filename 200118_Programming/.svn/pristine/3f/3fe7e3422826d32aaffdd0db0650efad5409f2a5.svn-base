import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		while (true) { // Was it a cat I saw? 가 나올때 까지 계속 입력
			String a = sc.nextLine();
			if (a.equals("Was it a cat I saw?")) {
				break;
			} else {
				list.add(a);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			String result = list.get(i);

			result = substr(result, i + 1);

			System.out.println(result);
		}
	}

	public static String substr(String a, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < a.length(); i += (n+1)) {
			result.append(a.charAt(i));
		}
		return result.toString();
	}
}
