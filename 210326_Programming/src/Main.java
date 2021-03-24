import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String temp = br.readLine();
			String[] temp2 = temp.substring(1, temp.length() - 1).split(",");
			Deque<String> arr = new ArrayDeque<String>();

			for (int j = 0; j < n; j++) {
				arr.add(temp2[j]);
			}

			Solve(p, arr);
		}
	}

	public static void Solve(String p, Deque<String> arr) {
		boolean reverse = false;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == 'R') {
				reverse = !reverse;
			} else {
				if (arr.size() == 0) {
					System.out.println("error");
					return;
				} else if (reverse) {
					arr.removeLast();
				} else {
					arr.removeFirst();
				}
			}
		}
		StringBuilder sb = new StringBuilder("[");
        while (!arr.isEmpty()) {
            sb.append(reverse ? arr.removeLast() : arr.removeFirst());
            if (arr.size() != 0)
                sb.append(',');
        }
        sb.append(']');
        System.out.println(sb);
	}
}
