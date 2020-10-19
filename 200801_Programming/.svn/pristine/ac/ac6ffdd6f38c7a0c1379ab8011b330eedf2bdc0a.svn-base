import java.util.Scanner;

public class Main {
	static int[][] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int result = solution(s);
		System.out.println(result);
	}

	public static int solution(String s) {
		int[] arr = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - 48; // 문자열을 문자로 만든 후 -48로 숫자로 변환시킨후 숫자 배열에 저장
		}

		int start = 0;
		int mid = 0;
		int end = (s.length() % 2 == 0 ? s.length() : s.length() - 1); // 문자열의 길이가 홀수일 경우 -1을 해줌;

		while (end > 0) {
			int start_Temp = start;
			int end_Temp = end;
			while (end_Temp <= s.length()) {
				mid = (start_Temp + end_Temp) / 2;
				int left = 0;
				int right = 0;

				for (int i = start_Temp; i < mid; i++)
					left += arr[i];
				for (int i = mid; i < end_Temp; i++)
					right += arr[i];

				if (left == right) {
					return end;
				}
				start_Temp++;
				end_Temp++;
			}
			start = 0;
			end -= 2;
		}
		return 0;
	}
}