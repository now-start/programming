import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	static int[][] map;
	static boolean[][] visit;
	static int[] px = { 0, 0, -1, 1 }; // 동 서 남 북
	static int[] py = { 1, -1, 0, 0 };
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		visit = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			// 숫자를 붙여서 입력하기 때문에 문자열로 받은후 하나씩 잘라서 map에 넣는다.
			String tmp = sc.next();

			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(tmp.substring(j, j + 1));
			}
		}

		// 단지 갯수 저장용 리스트
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 방문하지 않은 아파트가 있다면 DFS 시작
				if (map[i][j] == 1 && !visit[i][j]) {
					visit[i][j] = true;
					result = 1;
					DFS(i, j);
					list.add(result);
				}
			}
		}
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	static void DFS(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nextX = x + px[i];
			int nextY = y + py[i];
			// 좌표가 표의 좌표값을 벗어나는지 확
			if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n) {
				// 다음 아파트가 방문하지 않았다면 계속 진행
				if (map[nextX][nextY] == 1 && !visit[nextX][nextY]) {
					visit[nextX][nextY] = true;
					result++;
					DFS(nextX, nextY);
				}
			}
		}
	}
}