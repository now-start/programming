import java.util.Scanner;

public class Main {
	static int n;
	static int[][] board;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		DFS(0);

		System.out.println(max);
	}

	public static void DFS(int deep) {
		if (deep == 5) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					max = max < board[i][j] ? board[i][j] : max;
				}
			}
			return;
		}

		for (int i = 0; i < 4; i++) {// 0123 : 상하좌우
			int[][] temp = new int[n][n];

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					temp[j][k] = board[j][k];
				}
			}

			move(i);
			DFS(deep + 1);

			// board 값을 초기화 해준다
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					board[j][k] = temp[j][k];
				}
			}
		}
	}

	public static void move(int d) {
		switch (d) {
		case 0: // 상
			for (int i = 0; i < n; i++) { // 열을 고르고
				int count = 0; // 0의갯수 확인용
				int memo = 0; // 이전의 값을 저장
				for (int j = 0; j < n; j++) { // 열의 맨 위 부터
					if (board[j][i] == 0) { // 이전의 값과 지금의 값이 같다면
						count++;
					} else { // 지금의 값을 2배로 0이 아닌칸을 제외하고 제일 오른쪽으로 보낸다.
						if (memo == board[j][i]) {
							board[j - count - 1][i] = board[j][i] + board[j][i];
							board[j][i] = 0; // 지금 칸은 0으로 만든다.
							memo = 0; // 가장 오른쪽에서부터 2개씩만 합쳐질수 있으니 합쳐지면 다시 초기화
							count++; // 2개의 값이 합쳐져 1개의 0값이 생기니 0의 갯수는 하나 늘어남
						} else { // 0이 아닌칸을 제외하고 제일 위쪽으로 보낸다.
							board[j - count][i] = board[j][i];
							memo = board[j][i]; // 지금의 값을 memo에 저장
							if (count != 0) { // count 가 0이 아니라면 지금의 값 0으로 만든다. 만약 0 이라면 가장 위쪽 값이기에 제외
								board[j][i] = 0;
							}
						}
					}
				}
			}
			break;
		case 1: // 하
			for (int i = 0; i < n; i++) {
				int count = 0;
				int memo = 0;
				for (int j = n - 1; j >= 0; j--) {
					if (board[j][i] == 0) {
						count++;
					} else {
						if (memo == board[j][i]) {
							board[j + count + 1][i] = board[j][i] + board[j][i];
							board[j][i] = 0;
							memo = 0;
							count++;
						} else {
							board[j + count][i] = board[j][i];
							memo = board[j][i];
							if (count != 0) {
								board[j][i] = 0;
							}
						}
					}
				}
			}
			break;
		case 2: // 좌
			for (int i = 0; i < n; i++) {
				int count = 0;
				int memo = 0;
				for (int j = 0; j < n; j++) {
					if (board[i][j] == 0) {
						count++;
					} else {
						if (memo == board[i][j]) {
							board[i][j - count - 1] = board[i][j] + board[i][j];
							board[i][j] = 0;
							memo = 0;
							count++;
						} else {
							board[i][j - count] = board[i][j];
							memo = board[i][j];
							if (count != 0) {
								board[i][j] = 0;
							}
						}
					}
				}
			}
			break;
		case 3: // 우
			for (int i = 0; i < n; i++) {
				int count = 0;
				int memo = 0;
				for (int j = n - 1; j >= 0; j--) {
					if (board[i][j] == 0) {
						count++;
					} else {
						if (memo == board[i][j]) {
							board[i][j + count + 1] = board[i][j] + board[i][j];
							board[i][j] = 0;
							memo = 0;
							count++;
						} else {
							board[i][j + count] = board[i][j];
							memo = board[i][j];
							if (count != 0) {
								board[i][j] = 0;
							}
						}
					}
				}
			}
			break;
		}
	}

}
