import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1254
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			boolean flag = true;

			// isPalindrome
			for (int j = 0; j < (s.length() - i) / 2; j++) {
				if (s.charAt(j + i) != s.charAt(s.length() - j - 1)) {
					flag = false;
					break;
				}
			}

			if (flag) {
				bw.write((s.length() + i) + "");
				break;
			}
		}

		bw.flush();
	}
}