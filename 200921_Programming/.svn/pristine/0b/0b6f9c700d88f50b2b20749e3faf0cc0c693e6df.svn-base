import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		System.out.print("<");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k - 1; j++) {
				list.add(list.get(0));
				list.remove(0);
			}
			
			if (i == n - 1) {
				System.out.print(list.get(0));
				list.remove(0);
			} else {
				System.out.print(list.get(0) + ", ");
				list.remove(0);
			}
		}
		System.out.print(">");
	}

}
