import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		List<String> s = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		for (int i = 1; i <= n; i++) {
			stack.push(i);
			s.add("+");
			while (!stack.isEmpty() && stack.peek().equals(list.get(0))) {
				stack.pop();
				list.remove(0);
				s.add("-");
			}
		}

		if (!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			for (int i = 0; i < s.size(); i++) {
				System.out.println(s.get(i));
			}
		}
	}

}
