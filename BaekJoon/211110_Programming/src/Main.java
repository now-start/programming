import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 1916
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		List<int[]>[] graph = new List[n + 1];

		// input
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<int[]>();
		}
		while (m-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] tempEdge = new int[3];
			tempEdge[0] = Integer.parseInt(st.nextToken());
			tempEdge[1] = Integer.parseInt(st.nextToken());
			tempEdge[2] = Integer.parseInt(st.nextToken());
			graph[tempEdge[0]].add(tempEdge);
		}

		StringTokenizer st = new StringTokenizer(br.readLine());
		int from = Integer.parseInt(st.nextToken());
		int to = Integer.parseInt(st.nextToken());

		// main
		int[] result = Dijkstra(graph, from);

		// output
		bw.write(result[to] + "");
		bw.flush();
	}

	private static int[] Dijkstra(List<int[]>[] graph, int from) {
		int[] dist = new int[graph.length];
		boolean[] visits = new boolean[graph.length];
		PriorityQueue<Point> priorityQueue = new PriorityQueue<Point>(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.dist - o2.dist;
			}
		});

		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[from] = 0;

		for (int i = 1; i < dist.length; i++) {
			if (i == from) {
				priorityQueue.add(new Point(from, 0));
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