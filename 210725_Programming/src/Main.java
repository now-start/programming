import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//1946
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] score = new int[n][2];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				score[i][0] = Integer.parseInt(st.nextToken());
				score[i][1] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(score, (int[] o1, int[] o2) -> {
				if (o1[0] > o2[0])
					return 1;
				else
					return -1;
			});

			// main
			int count = 1;
			int temp = score[0][1];
			for (int i = 1; i < n; i++) {
				if (temp > score[i][1]) {
					count++;
					temp = score[i][1];
				}
			}

			bw.write(count + "\n");
		}

		bw.flush();
	}

}
