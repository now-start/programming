import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2947
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// input
		String s = br.readLine();
		String[] temp = s.split(" ");
		int[] arr = new int[temp.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}

		// main
		for (int t = 0; t < arr.length; t++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;

					// output
					for (int j = 0; j < arr.length; j++) {
						bw.write(arr[j] + " ");
					}
					bw.write("\n");
				}
			}
		}

		bw.flush();
	}

}
