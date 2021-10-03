import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2581
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];

		// input
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				for (int j = i * i; j < arr.length; j += i) {
					arr[j] = 1;
				}
			}
		}

		// main
		int sum = 0;
		int min = 0;
		for (int i = n; i >= m; i--) {
			if (arr[i] == 0) {
				sum += i;
				min = i;
			}
		}

		// output
		if (sum == 0) {
			bw.write(-1 + "");
		} else {
			bw.write(sum + "\n" + min);
		}
		bw.flush();
	}

}
