import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 2004
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		// input
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// main
		int five = five(n) - five(n - m) - five(m);
		int two = two(n) - two(n - m) - two(m);

		// output
		bw.write(Math.min(five, two)+"");
		bw.flush();
	}

	static int five(int a) {
		int count = 0;

		while (a >= 5) {
			count += a / 5;
			a /= 5;
		}
		return count;
	}

	static int two(int a) {
		int count = 0;

		while (a >= 2) {
			count += a / 2;
			a /= 2;
		}
		return count;
	}
}
