import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		boolean check[];

		while (true) {
			String a = sc.next();
			if (a.equals("0")) {
				break;
			} else {
				list.add(a);
			}
		}
		check = new boolean[list.size()];

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 1) { // 길이가 1인경우 무조건 팰린드롬수
				check[i] = true;
			}
			for (int j = 0; j < list.get(i).length() / 2; j++) {
				if (list.get(i).charAt(j) == list.get(i).charAt(list.get(i).length() - j - 1)) {
					check[i] = true;
				} else {
					check[i] = false;
					break;
				}
			}
		}

		for (int i = 0; i < check.length; i++) {
			if (check[i]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

}
