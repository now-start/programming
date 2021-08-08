import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] node = new int[n + 1][n + 1];
		int min = Integer.MAX_VALUE;
		int result = 0;

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			node[y][x] = node[x][y] = 1;
		}

		for (int i = 1; i <= n; i++) {
			int temp = BFS(node, i);
			if (min > temp) {
				min = temp;
				result = i;
			}
		}

		System.out.println(result);
	}

	private static int BFS(int[][] node, int n) {
		int result = 0;
		int[] visit = new int[node.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(n);
		// 모든 간선에 1씩 추가 된다
		// 하지만 결과 값의 영향을 주지 않는다.
		visit[n] = 1;

		while (!queue.isEmpty()) {
			int i = queue.poll();

			for (int j = 1; j < node.length; j++) {
				if (node[i][j] == 1 && visit[j] == 0) {
					queue.add(j);
					visit[j] = visit[i] + 1;
				}
			}
		}

		for (int i = 0; i < visit.length; i++) {
			result += visit[i];
		}

		return result;
	}

}
