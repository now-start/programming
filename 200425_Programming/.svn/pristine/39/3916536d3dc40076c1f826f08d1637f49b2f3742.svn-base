import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean[][] node; // 노드의 연결 정보
	static boolean[] visit; // 노드 방문 확인
	static int n; // 정점의 개수
	static int m; // 간선의 개수
	static int v; // 정점의 번호

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		node = new boolean[n + 1][n + 1];
		visit = new boolean[n + 1];

		// 방문할 수 있는 정점이 여러 개인 경우에는
		// 정점 번호가 작은 것을 먼저 방문하기 위해서
		// 행열로 정점과 간선을 맵핑한다.
		// 그러면 N번 정점에서 방문 할 수 있는
		// 정점 N개를 쉽게 파악 할 수 있다.

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			node[x][y] = true;
			node[y][x] = true;
		}

		DFS(v);
		System.out.println();
		BFS(v);
	}

	static void DFS(int v) {
		visit[v] = true;
		System.out.print(v + " ");

		for (int i = 1; i <= n; i++) {
			if (node[v][i] && !visit[i]) { // 노드가 연결되있고 방문하지 않은 노드 일 경우 실행
				DFS(i);
			}
		}
	}

	static void BFS(int v) {
		Arrays.fill(visit, false); // 방문기록 초기화

		List<Integer> list = new ArrayList<>();
		visit[v] = true;
		list.add(v);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			for (int j = 1; j <= n; j++) {
				if (node[list.get(i)][j] && !visit[j]) { // 노드가 연결되있고 방문하지 않은 노드 일 경우 실행
					list.add(j);
					visit[j] = true;
				}
			}
		}
	}
}
