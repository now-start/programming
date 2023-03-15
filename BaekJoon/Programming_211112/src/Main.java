import java.io.*;
import java.util.Stack;

// 17413
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		Stack<Character> stack = new Stack<Character>();

		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				while (!stack.empty()) {
					bw.write(stack.pop());
				}
				bw.write("<");
				flag = true;
			} else if (s.charAt(i) == '>') {
				bw.write(">");
				flag = false;
			} else if (flag) {
				bw.write(s.charAt(i));
			} else if (s.charAt(i) == ' ') {
				while (!stack.empty()) {
					bw.write(stack.pop());
				}
				bw.write(" ");
			} else {
				stack.push(s.charAt(i));
			}
		}

		while (!stack.empty()) {
			bw.write(stack.pop());
		}

		bw.flush();
	}
}
