import java.util.Scanner;

//15652
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[9];

		backTraking(arr, 0, n, m);
	}

	public static void backTraking(int[] arr, int cnt, int n, int m) {
		if (cnt == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = (cnt == 0) ? 1 : arr[cnt - 1]; i <= n; i++) {
			arr[cnt] = i;
			backTraking(arr, cnt + 1, n, m);
		}

	}

}
