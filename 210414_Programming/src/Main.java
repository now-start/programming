import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] sortArr = new int[n];
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sortArr[i] = arr[i] = temp;
		}

		Arrays.sort(sortArr);

		int count = 0;
		for (int i = 0; i < n; i++) {
			int temp = sortArr[i];
			if (!map.containsKey(temp)) {
				map.put(temp, count);
				count++;
			}
		}

		for (int i = 0; i < n; i++) {
			bw.write(map.get(arr[i]) + " ");
		}

		bw.flush();
	}

}
