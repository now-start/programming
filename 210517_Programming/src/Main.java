import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < n + 1; i++) {
			list.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list.get(a).add(b);
			list.get(b).add(a);
		}

		// main
		int[] result = BFS(list, 1);

		// output
		for (int i = 2; i < result.length; i++) {
			bw.write(result[i] + "\n");
		}
		bw.flush();
	}

	private static int[] BFS(List<List<Integer>> list, int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] root = new int[list.size()];
		queue.add(start);

		while (!queue.isEmpty()) {
			int temp = queue.poll();

			for (int i : list.get(temp)) {
				if (root[i] == 0) {
					root[i] = temp;
					queue.add(i);
				}
			}
		}

		return root;
	}

}
