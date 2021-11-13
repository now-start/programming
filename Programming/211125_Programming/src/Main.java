import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1075
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());

		int temp = (n / 100) * 100;
		for (int i = temp;; i++) {
			if (i % f == 0) {
				bw.write((i % 100) < 10 ? "0" + (i % 100) : (i % 100) + "");
				break;
			}
		}

		bw.flush();
	}

}
