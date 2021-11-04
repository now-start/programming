import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

// 4358
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String s = br.readLine();
		while (true) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
			count++;

			s = br.readLine();
			if (s == null || s.length() == 0) {
				break;
			}
		}

		map.forEach((key, value) -> {
			try {
				bw.write(key + " " + String.format("%.4f", (double) value / count * 100) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		bw.flush();
	}

}
