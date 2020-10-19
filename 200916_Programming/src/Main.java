import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		int arr2[] = new int[m];

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st1.nextToken());
		}

		Arrays.sort(arr);
		for (int i = 0; i < m; i++) {
			if (upper(arr, arr2[i]) == n - 1 && arr[n - 1] == arr2[i])
				System.out.print(upper(arr, arr2[i]) - lower(arr, arr2[i]) + 1 + " ");
			else
				System.out.print(upper(arr, arr2[i]) - lower(arr, arr2[i]) + " ");
		}
	}

	public static int lower(int[] arr, int arr2) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;

			if (arr[mid] >= arr2) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	public static int upper(int[] arr, int arr2) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;

			if (arr[mid] > arr2) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}
}
