import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		// input
		while (n-- > 0) {
			String temp = sc.next();
			String left = sc.next();
			String right = sc.next();

			List<String> list = new ArrayList<String>();
			list.add(left);
			list.add(right);
			map.put(temp, list);
		}

		// main
		String front = Front(map, "A");
		String mid = Mid(map, "A");
		String back = Back(map, "A");

		// output
		System.out.println(front);
		System.out.println(mid);
		System.out.println(back);
	}

	private static String Front(Map<String, List<String>> map, String string) {
		if (string.equals(".")) {
			return "";
		}

		return string + Front(map, map.get(string).get(0)) + Front(map, map.get(string).get(1));
	}

	private static String Mid(Map<String, List<String>> map, String string) {
		if (string.equals(".")) {
			return "";
		}

		return Mid(map, map.get(string).get(0)) + string + Mid(map, map.get(string).get(1));
	}

	private static String Back(Map<String, List<String>> map, String string) {
		if (string.equals(".")) {
			return "";
		}

		return Back(map, map.get(string).get(0)) + Back(map, map.get(string).get(1)) + string;
	}

}
