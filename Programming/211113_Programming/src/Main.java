import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	// 1543
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		String search = br.readLine();

		// main
		int count = 0;

		s = s.replace(search, "1");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}

		bw.write(count + "");
		bw.flush();
	}

}
