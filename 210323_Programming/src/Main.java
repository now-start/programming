import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int edge = sc.nextInt();
		int[][] node = new int[n + 1][n + 1];

		for (int i = 0; i < edge; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			node[y][x] = node[x][y] = 1;
		}

		int count = BFS(node);

		System.out.println(count);
	}

	private static int BFS(int[][] node) {
		int count = 0;
		int[] visit = new int[node.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		visit[1] = 1;

		while (!queue.isEmpty()) {
			int i = queue.poll();
			for (int j = 1; j < node.length; j++) {
				if (node[i][j] == 1 && visit[j] == 0) {
					queue.add(j);
					visit[j] = 1;
					count++;
				}
			}
		}
		return count;
	}

}
