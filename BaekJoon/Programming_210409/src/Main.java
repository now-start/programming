import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<Integer>();

		while (m-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int x = 0;
			if (!s.equals("all") && !s.equals("empty")) {
				x = Integer.parseInt(st.nextToken());
			}

			if (s.equals("add")) {
				set.add(x);
			} else if (s.equals("remove")) {
				set.remove(x);
			} else if (s.equals("check")) {
				if (set.isEmpty() || !set.contains(x)) {
					bw.write("0\n");
				} else {
					bw.write("1\n");
				}
			} else if (s.equals("toggle")) {
				if (set.isEmpty() || !set.contains(x)) {
					set.add(x);
				} else {
					set.remove(x);
				}
			} else if (s.equals("all")) {
				set = new HashSet<Integer>();
				for (int i = 1; i <= 20; i++) {
					set.add(i);
				}
			} else if (s.equals("empty")) {
				set = new HashSet<Integer>();
			}
		}

		bw.flush();
	}
}
