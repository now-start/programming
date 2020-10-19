import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; // input
		int freq[] = new int[8001]; // freq
		double sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			freq[arr[i] + 4000]++;
			sum += arr[i];
		}

		// 산술평균
		System.out.println(Math.round(sum / n));

		// 중앙값
		Arrays.sort(arr);
		System.out.println(arr[n / 2]);

		// 최빈값
		int max = 0;
		for (int i = 0; i < freq.length; i++) {
			max = Math.max(max, freq[i]);
		}

		int tmp = 0;
		boolean is_first = true; // 빈도가 같은 수가 2개 일경우 2번째로 작은 값을 출력
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == max) {
				tmp = i - 4000;
				if (is_first) {
					is_first = false;
				} else {
					break;
				}
			}
		}
		System.out.println(tmp);

		// 범위
		System.out.println(arr[n - 1] - arr[0]);
	}

}
