import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long[] arr = new long[n + 1];

			if (n >= 1) {
				arr[1] = 1;
			}
			if (n >= 2) {
				arr[2] = 1;
			}
			if (n >= 3) {
				arr[3] = 1;
			}
			if (n >= 4) {
				arr[4] = 2;
			}
			if (n >= 5) {
				arr[5] = 2;
			}
			if (n >= 6) {
				for (int i = 6; i <= n; i++) {
					arr[i] = arr[i - 1] + arr[i - 5];
				}
			}

			System.out.println(arr[n]);
		}

	}

}
