import java.util.Scanner;

// 15649
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[m];
		boolean[] visit = new boolean[n];

		DFS(arr, visit, n, 0, 0);

	}

	public static void DFS(int[] arr, boolean[] visit, int n, int index, int now) {
		if (index == arr.length) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (!visit[i-1]) {
				visit[i-1] = true;
				arr[index] = i;
				DFS(arr, visit, n, index + 1, i);
				visit[i-1] = false;
			}
		}
	}

}