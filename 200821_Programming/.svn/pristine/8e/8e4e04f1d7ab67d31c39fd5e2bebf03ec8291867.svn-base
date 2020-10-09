import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0 && j != arr[i]) {
					break;
				} else if (j == arr[i]) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
