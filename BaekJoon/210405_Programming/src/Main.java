import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int result = 1;
			Map<String, Integer> map = new HashMap<String, Integer>();

			for (int i = 0; i < n; i++) {
				String temp = br.readLine().split(" ")[1];
				if (map.containsKey(temp)) {
					map.put(temp, map.get(temp) + 1);
				} else {
					map.put(temp, 1);
				}
			}

			for (int i : map.values()) {
				result *= i + 1;
			}

			System.out.println(result - 1);
		}

	}
}
