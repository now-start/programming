import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		// main
		for (int i = 1; i <= n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			while (!stack.isEmpty() && stack.peek()[0] < temp)
				stack.pop();
			bw.write(stack.isEmpty() ? 0 + " " : stack.get(stack.size() - 1)[1] + " ");
			stack.push(new int[] { temp, i });
		}

		bw.flush();

	}

}
