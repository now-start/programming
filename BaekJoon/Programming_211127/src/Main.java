import java.io.*;

// 5373
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static char[][][] cube = new char[6][3][3];
	static char[] init = {'w', 'y', 'r', 'o', 'g', 'b'};

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			// init cube
			for (int i = 0; i < 6; ++i) {
				for (int j = 0; j < 3; ++j) {
					for (int k = 0; k < 3; ++k) {
						cube[i][j][k] = init[i];
					}
				}
			}

			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				String temp = s[i];
				boolean clk = temp.charAt(1) == '+';

				int U = 0, D = 1, F = 2, B = 3, L = 4, R = 5;
				if (temp.charAt(0) == 'U') {
					alter(U, L, F, R, B, clk);
				} else if (temp.charAt(0) == 'D') {
					alter(D, B, R, F, L, clk);
				} else if (temp.charAt(0) == 'F') {
					alter(F, U, L, D, R, clk);
				} else if (temp.charAt(0) == 'B') {
					alter(B, R, D, L, U, clk);
				} else if (temp.charAt(0) == 'L') {
					alter(L, F, U, B, D, clk);
				} else if (temp.charAt(0) == 'R') {
					alter(R, D, B, U, F, clk);
				}
			}

			// output
			for (int i = 0; i < 3; ++i) {
				for (int j = 0; j < 3; ++j) {
					bw.write(cube[0][j][2 - i]);
				}
				bw.write("\n");
			}
		}

		bw.flush();
	}

	private static void alter(int f, int u, int l, int d, int r, boolean clk) {
		char[][] tmp = new char[3][3];
		char[] tmp2 = new char[3];

		if (clk) {
			for (int i = 0; i < 3; ++i)
				for (int j = 0; j < 3; ++j) {
					tmp[i][j] = cube[f][2 - j][i];
				}
			for (int i = 0; i < 3; ++i)
				tmp2[i] = cube[u][i][0];
			for (int i = 0; i < 3; ++i)
				cube[u][i][0] = cube[l][0][2 - i];
			for (int i = 0; i < 3; ++i)
				cube[l][0][2 - i] = cube[d][2][i];
			for (int i = 0; i < 3; ++i)
				cube[d][2][i] = cube[r][2 - i][2];
			for (int i = 0; i < 3; ++i)
				cube[r][2 - i][2] = tmp2[i];
		} else {
			for (int i = 0; i < 3; ++i)
				for (int j = 0; j < 3; ++j) {
					tmp[i][j] = cube[f][j][2 - i];
				}
			for (int i = 0; i < 3; ++i)
				tmp2[i] = cube[u][i][0];
			for (int i = 0; i < 3; ++i)
				cube[u][i][0] = cube[r][2 - i][2];
			for (int i = 0; i < 3; ++i)
				cube[r][2 - i][2] = cube[d][2][i];
			for (int i = 0; i < 3; ++i)
				cube[d][2][i] = cube[l][0][2 - i];
			for (int i = 0; i < 3; ++i)
				cube[l][0][2 - i] = tmp2[i];
		}
		cube[f] = tmp;
	}
}
