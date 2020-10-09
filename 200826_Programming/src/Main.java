import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Character> stack;
		boolean check;
		String result[] = new String[n];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			stack = new Stack<Character>();
			check = true;

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(') {
					stack.push(s.charAt(j));
				} else if (s.charAt(j) == ')') {
					if (stack.isEmpty()) {
						check = false;
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (check && stack.empty()) {
				result[i] = "YES";
			} else {
				result[i] = "NO";
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}

	}

}
