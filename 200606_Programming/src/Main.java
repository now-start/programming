import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();

		int[] inDegree = new int[n + 1];

		List<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			graph.get(a).add(b);
			inDegree[b]++;
		}

		topologicalSort(graph, inDegree);
	}

	public static void topologicalSort(List<ArrayList<Integer>> graph, int[] inDegree) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i < n + 1; i++) {
			if (inDegree[i] == 0) {
				queue.add(i);
			}
		}

		for (int i = 0; i < n; i++) {
			int v = queue.remove();
			System.out.print(v + " ");

			for (int j = 0; j < graph.get(v).size(); j++) {
				inDegree[graph.get(v).get(j)]--;

				if (inDegree[graph.get(v).get(j)] == 0) {
					queue.add(graph.get(v).get(j));
				}
			}
		}
	}
}