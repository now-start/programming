import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next(); // ¹Ù²Ü ¹®ÀÚ
		String s = sc.next(); // ¹®Á¦
		int n = sc.nextInt(); // ÀÔ·Â È½¼ö
		int count = 0; // ¹Ýº¹ È½¼ö
		String result; // °á°ú

		for (int i = 0; i < n; i++) {
			if (s.contains(w)) {
				String sw = sc.next();

				switch (sw) {
				case "L":
					s = s.replaceFirst(w, "");
					break;
				case "R":
					s = replaceLast(s, w, "");
					break;
				}
				count++;
			} else {
				break;
			}
		}

		//½ÂÆÐÈ®ÀÎ
		if (s.contains(w)) {
			result = "You Lose!";
		} else {
			result = "Perfect!";
		}

		System.out.println(count);
		System.out.println(s);
		System.out.println(result);
	}

	public static String replaceLast(String string, String toReplace, String replacement) {
		int pos = string.lastIndexOf(toReplace);
		if (pos > -1) {
			return string.substring(0, pos) + replacement + string.substring(pos + toReplace.length(), string.length());
		} else {
			return string;
		}
	}
	
	public static String replaceLast2(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
    }
}
