import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//11728
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		int[] b = new int[m];

		// input
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		// main
		int index_a = 0;
		int index_b = 0;
		while (index_a < n && index_b < m) {
			if (a[index_a] > b[index_b]) {
				bw.write(b[index_b++] + " ");
			} else {
				bw.write(a[index_a++] + " ");
			}
		}

		while (index_a < n) {
			bw.write(a[index_a++] + " ");
		}
		while (index_b < m) {
			bw.write(b[index_b++] + " ");
		}

		// output
		bw.flush();
	}

}
