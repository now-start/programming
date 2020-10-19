import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0) {
				a.add(x);
				b.add(y);
				break;
			} else {
				a.add(x);
				b.add(y);
			}
		}

		for (int i = 0; i < a.size(); i++) {
			int sum = a.get(i) + b.get(i);
			if(sum !=0) {
				System.out.println(sum);
			}
		}
	}

}
