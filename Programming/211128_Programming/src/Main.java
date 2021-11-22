import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1059
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int l = Integer.parseInt(br.readLine());
		int[] s = new int[l];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < l; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		int n = Integer.parseInt(br.readLine());

		Arrays.sort(s);
		int index = 0;
		for (int i = 0; i < l; i++) {
			if (n <= s[i]) {
				index = i;
				break;
			}
		}

		if (n == s[index]) {
			bw.write("0");
		} else if (index == 0) {
			int temp = (s[index] - n) * (n - 1) + (s[index] - n - 1);
			bw.write(temp + "");
		} else {
			int temp = (s[index] - n) * (n - (s[index - 1] + 1)) + (s[index] - n - 1);
			bw.write(temp + "");
		}

		bw.flush();
	}

}
