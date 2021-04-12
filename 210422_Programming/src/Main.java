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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		int result = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result = Math.max(result, BF(arr, i, j));
			}
		}

		bw.write(result + " ");
		bw.flush();
	}

	private static int BF(int[][] arr, int i, int j) {
		int result = 0;
		int width = arr[0].length;
		int height = arr.length;

		// けけけけ
		if (j + 3 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
			result = Math.max(result, temp);
		}
		if (i + 3 < height) {
			int temp = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j];
			result = Math.max(result, temp);
		}

		// けけ
		// けけ
		if (i + 1 < height && j + 1 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
			result = Math.max(result, temp);
		}

		// け
		// け
		// けけ
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 2][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j];
			result = Math.max(result, temp);
		}
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j + 2] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
			result = Math.max(result, temp);
		}
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 2][j];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
			result = Math.max(result, temp);
		}
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2];
			result = Math.max(result, temp);
		}

		// け
		// けけ
		// ぱけ
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j] + arr[i + 1][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j] + arr[i + 2][j];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j + 2];
			result = Math.max(result, temp);
		}

		// けけけ
		// ぱけ
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 1][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 2 < height && j + 1 < width) {
			int temp = arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 2][j + 1];
			result = Math.max(result, temp);
		}
		if (i + 1 < height && j + 2 < width) {
			int temp = arr[i + 1][j] + arr[i + 1][j + 1] + arr[i + 1][j + 2] + arr[i][j + 1];
			result = Math.max(result, temp);
		}

		return result;
	}

}
