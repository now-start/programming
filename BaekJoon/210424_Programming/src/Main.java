import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			bw.write(BFS(a, b) + "\n");
		}

		bw.flush();
	}

	private static String BFS(int a, int b) {
		Queue<State> queue = new LinkedList<State>();
		boolean[] visit = new boolean[10000];
		queue.add(new State(a, ""));
		visit[a] = true;
		String result = null;
		String[] d = { "D", "S", "L", "R" };

		while (!queue.isEmpty()) {
			State temp = queue.poll();
			if (temp.a == b) {
				result = temp.result;
				break;
			}

			for (int i = 0; i < d.length; i++) {
				if (!visit[temp.cal(d[i])]) {
					queue.add(new State(temp.cal(d[i]), temp.result + d[i]));
				}
				visit[temp.cal(d[i])] = true;
			}
		}

		return result;
	}

}

class State {
	int a;
	String result;

	public State(int a, String result) {
		this.a = a;
		this.result = result;
	}

	public int cal(String string) {
		int temp = 0;

		if (string.equals("D")) {
			temp = a * 2;
			if (temp > 9999) {
				temp %= 10000;
			}
		} else if (string.equals("S")) {
			temp = a - 1;
			if (temp < 0) {
				temp = 9999;
			}
		} else if (string.equals("L")) {
			temp = a % 1000 * 10;
			temp += a / 1000;
		} else {
			temp = a % 10 * 1000;
			temp += a / 10;
		}

		return temp;
	}
}
