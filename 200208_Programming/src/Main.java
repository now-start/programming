import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int x;
	static int y;
	static int[][] map;
	static int[][] test_map;
	static int max;
	static List<Pos> pos0 = new ArrayList<Pos>();
	static List<Pos> pos2 = new ArrayList<Pos>();
	static int[] px = { 0, 0, -1, 1 }; // 동 서 남 북
	static int[] py = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열의 크기를 입력받는다.
		x = sc.nextInt(); // 세로
		y = sc.nextInt(); // 가로

		// 지도를 입력받는다.
		map = new int[x][y]; // 원본
		test_map = new int[x][y]; // 테스트

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 0) { // 0값의 좌표를 저장
					pos0.add(new Pos(i, j));
				}
				if (map[i][j] == 2) { // 2값의 좌표를 저장
					pos2.add(new Pos(i, j));
				}
			}
		}

		Reset(); // 테스트 맵에 원본 맵을 초기화
		max = Integer.MIN_VALUE; // 안전구역의 최댓값

		for (int x1 = 0; x1 < pos0.size(); x1++) { // 안전구역에 무작위로 벽 3개 설치
			for (int x2 = 0; x2 < pos0.size(); x2++) {
				if (x2 == x1) { // 좌표값이 같으면 패스
					continue;
				}
				for (int x3 = 0; x3 < pos0.size(); x3++) {
					if (x3 == x2) { // 좌표값이 같으면 패스
						continue;
					}
					if (x3 == x1) {
						continue;
					}

					test_map[pos0.get(x1).x][pos0.get(x1).y] = 1;
					test_map[pos0.get(x2).x][pos0.get(x2).y] = 1;
					test_map[pos0.get(x3).x][pos0.get(x3).y] = 1;

					BFS(); // 바이러스 확산
					max = Math.max(max, Check()); // 안전구역 개수 확인

					// 초기화
					Reset();
				}
			}
		}

		System.out.println(max);
	}

	// 맵과 테스트맵 깊은 복사, pos2 초기화
	static void Reset() {
		pos2 = null;
		pos2 = new ArrayList<Pos>();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				test_map[i][j] = map[i][j];
				if (map[i][j] == 2) { // 2값의 좌표를 저장
					pos2.add(new Pos(i, j));
				}
			}
		}
	}

	// 바이러스 확산
	static void BFS() {
		for (int i = 0; i < pos2.size(); i++) {
			for (int j = 0; j < 4; j++) {
				int nextX = pos2.get(i).x + px[j];
				int nextY = pos2.get(i).y + py[j];

				if (nextX < 0 || nextY < 0 || nextX >= x || nextY >= y) {
					// 배열 범위를 넘어가면 패스
					continue;
				} else if (test_map[nextX][nextY] == 1 || test_map[nextX][nextY] == 2) {
					// 벽에 막혀있거나 이미 바이러스에 감염됐다면 패스
					continue;
				} else {
					// 바이러스 전파
					pos2.add(new Pos(nextX, nextY));
					test_map[nextX][nextY] = 2;
				}
			}
		}
	}

	// 안전구역의 개수 채크
	static int Check() {
		int count = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (test_map[i][j] == 0)
					count++;
			}
		}
		return count;
	}

}

class Pos {
	int x;
	int y;

	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
