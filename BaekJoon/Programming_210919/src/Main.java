import java.io.*;
import java.util.StringTokenizer;

// 4796
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		for (int i = 1; ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			// break point(0 0 0)
			if (l == 0 && p == 0 && v == 0) {
				break;
			}

			// main
			int result = 0;
			result += (v / p) * l;
			result += Math.min(v % p, l); // ���� �ϼ��� l�ϼ��� �������� ����

			bw.write("Case " + i + ": " + result + "\n");
		}

		// output
		bw.flush();
	}

}
