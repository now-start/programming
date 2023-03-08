import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 플로이드-와샬
		arr = FW(arr);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				bw.append(arr[i][j] + " ");
			}
			bw.append("\n");
		}

		bw.flush();
	}

	private static int[][] FW(int[][] arr) {
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][k] + arr[k][j] >= 2)
						arr[i][j] = 1;
				}
			}
		}

		return arr;
	}

}
