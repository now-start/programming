import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			switch (s) {
			case "push_front":
				list.add(0, sc.nextInt());
				break;
			case "push_back":
				list.add(sc.nextInt());
				break;
			case "pop_front":
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(list.get(0));
					list.remove(0);
				}
				break;
			case "pop_back":
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				}
				break;
			case "size":
				System.out.println(list.size());
				break;
			case "empty":
				if (list.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(list.get(0));
				}
				break;
			case "back":
				if (list.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(list.get(list.size() - 1));
				}
				break;
			}
		}
	}

}
