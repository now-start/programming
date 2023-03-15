import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		List<int[]>[] graph = new List[v + 1];

		// input
		for (int i = 1; i <= v; i++) {
			graph[i] = new ArrayList<int[]>();
		}
		while (e-- > 0) {
			st = new StringTokenizer(br.readLine());
			int[] tempEdge = new int[3];
			tempEdge[0] = Integer.parseInt(st.nextToken());
			tempEdge[1] = Integer.parseInt(st.nextToken());
			tempEdge[2] = Integer.parseInt(st.nextToken());
			graph[tempEdge[0]].add(tempEdge);
		}

		// main
		int[] result = Dijkstra(graph, k);

		// output
		for (int i = 1; i < result.length; i++) {
			if (result[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(result[i]);
			}
		}
	}

	private static int[] Dijkstra(List<int[]>[] graph, int k) {
		int[] dist = new int[graph.length];
		boolean[] visits = new boolean[graph.length];
		PriorityQueue<Point> priorityQueue = new PriorityQueue<Point>(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.dist - o2.dist;
			}
		});

		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[k] = 0;

		for (int i = 1; i < dist.length; i++) {
			if (i == k) {
				priorityQueue.add(new Point(k, 0));
			} else {
				priorityQueue.add(new Point(i, Integer.MAX_VALUE));
			}
		}
		while (!priorityQueue.isEmpty()) {
			Point temp = priorityQueue.poll();
			if (visits[temp.index] == false) {
				dist[temp.index] = Math.min(dist[temp.index], temp.dist);
				visits[temp.index] = true;
				for (int[] i : graph[temp.index]) {
					if (visits[i[1]] == false) {
						priorityQueue.add((new Point(i[1], i[2] + temp.dist)));
					}
				}
			}
		}

		return dist;
	}

}

class Point {
	int index;
	int dist;

	public Point(int index, int dist) {
		this.index = index;
		this.dist = dist;
	}
}
