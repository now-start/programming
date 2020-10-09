import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		// ÀÌºÐÅ½»ö
		long start = 1;
		long end = arr[arr.length - 1];

		while (start <= end) {
			long mid = (start + end) / 2;
			long sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j] / mid;
			}
			if (sum >= n) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.println(end);
	}

}
