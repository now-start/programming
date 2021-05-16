import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> stack = new Stack<>();

		// main
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);

			if (temp == '(') {
				stack.push(temp);
			} else if (temp == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					System.out.print(stack.pop());
				}
				stack.pop();
			} else if (temp == '+' || temp == '-') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					System.out.print(stack.pop());
				}
				stack.add(temp);
			} else if (temp == '*' || temp == '/') {
				while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
					System.out.print(stack.pop());
				}
				stack.add(temp);
			} else {
				System.out.print(temp);
			}
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}