import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 1158
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		// 삭제가 계속 일어나기 때문에 ArrayList 보다 LinkedList 속도가 더 빠름
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		bw.write("<");
		while (list.size() != 1) {
			for (int i = 1; i < k; i++) {
				int temp = list.remove(0);
				list.add(temp);
			}
			bw.write(list.remove(0) + ", ");
		}
		bw.write(list.remove(0) + "");
		bw.write(">");

		bw.flush();
	}

}
