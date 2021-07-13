import java.util.Scanner;

//6603
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// input
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] arr = new int[n];
			int[] lotto = new int[6];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// main
			DFS(arr, lotto, 0, 0);
			System.out.println();

		}

	}

	private static void DFS(int[] arr, int[] lotto, int start, int count) {
		if (count == 6) {
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = start; i < arr.length; i++) {
			lotto[count] = arr[i];
			DFS(arr, lotto, i + 1, count + 1);
		}
	}

}
