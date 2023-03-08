import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

// 10610
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// input
		String n = br.readLine();
		Integer arr[] = new Integer[n.length()];

		// main
		int sum = 0;
		boolean zero = false;
		for (int i = 0; i < n.length(); i++) {
			arr[i] = n.charAt(i) - 48;
			sum += n.charAt(i) - 48;
			if (n.charAt(i) - 48 == 0) {
				zero = true;
			}
		}

		// output
		if (zero && sum % 3 == 0) {
			Arrays.sort(arr,Collections.reverseOrder());
			for(int i=0;i<n.length();i++) {
				bw.write(arr[i] + "");
			}
		} else {
			bw.write("-1");
		}

		bw.flush();
	}

}
