import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1065
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());

		// (n<=1000)
		if(n>=100) {
			int count = 99;
			for (int i = 100; i <= n; i++) {
				char[] arr = Integer.toString(i).toCharArray();
				if (arr[0] - arr[1] == arr[1] - arr[2]) {
					count++;
				}
			}
			bw.write(count + "");
		}else {
			bw.write(n + "");
		}

		bw.flush();
	}

}
