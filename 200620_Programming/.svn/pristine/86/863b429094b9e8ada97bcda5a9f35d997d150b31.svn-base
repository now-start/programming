import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	// 스캐너로 했을 경우 시간 초과 그래서 BufferedReader 사용
	// LinkedList, index 사용시 for 구문 내에서 size() 사용으로 인한 시간 초과
	// 그러므로 stack 2개를 활용하여 해결
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Object> left = new Stack<>();
		Stack<Object> right = new Stack<>();

		// 문자열을 한 문자씩 List 배열에 추가
		String s = bf.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
		}
		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String[] line = bf.readLine().split(" ");
			if (line[0].equals("L") && !left.empty()) {
				right.push(left.pop());
			} else if (line[0].equals("D") && !right.empty()) {
				left.push(right.pop());
			} else if (line[0].equals("B") && !left.empty()) {
				left.pop();
			} else if (line[0].equals("P")) {
				left.push(line[1].charAt(0));
			}
		}

		while (!left.empty()) {
			right.push(left.pop());
		}
		while (!right.empty()) {
			System.out.print(right.pop());
		}
		
	}

}
