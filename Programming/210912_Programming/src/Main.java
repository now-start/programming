import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 11729
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());

		// 최소 이동 횟수
		System.out.println((int) Math.pow(2, n) - 1);

		// 이동 경로
		hanoi(n, 1, 2, 3);
		
		// output
		bw.flush();
	}

	private static void hanoi(int n, int from, int by, int to) throws IOException {
		if (n == 0) {
			return;
		}
		hanoi(n - 1, from, to, by);
		bw.write(from + " " + to + "\n");
		hanoi(n - 1, by, from, to);
	}

}
