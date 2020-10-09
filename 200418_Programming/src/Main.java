import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		int d[] = new int[n];
		int max = 1;

		d[0] = 1;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && d[i] <= d[j]) { // 현제값 보다 작은 수 일때만 비교, 현제d의 값이 더 크면 비교 안함
					d[i] = d[j] + 1;
				} else if (arr[i] == arr[j]) {
					d[i] = d[j];
				}
			}
			max = Math.max(d[i], max);	//d의 최댓값을 max에 저장
		}

		System.out.println(max);
	}
}