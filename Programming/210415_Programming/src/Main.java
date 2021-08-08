import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int n = Integer.parseInt(br.readLine());

			while (n-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				if (st.nextToken().equals("I")) {
					int temp = Integer.parseInt(st.nextToken());
					if (map.containsKey(temp))
						map.put(temp, map.get(temp) + 1);
					else
						map.put(temp, 0);
				} else {
					int temp = Integer.parseInt(st.nextToken());
					if (!map.isEmpty() && temp == -1) {
						if (map.get(map.firstKey()) == 0) {
							map.remove(map.firstKey());
						} else {
							map.put(map.firstKey(), map.get(map.firstKey()) - 1);
						}
					} else if (!map.isEmpty() && temp == 1) {
						if (map.get(map.lastKey()) == 0) {
							map.remove(map.lastKey());
						} else {
							map.put(map.lastKey(), map.get(map.lastKey()) - 1);
						}
					}
				}
			}

			if (map.isEmpty()) {
				bw.append("EMPTY\n");
			} else {
				bw.append(map.lastKey() + " " + map.firstKey() + "\n");
			}
		}

		bw.flush();
	}

}
