import java.util.Scanner;

//1002
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			// x, y, r
			int[] arr1 = new int[3];
			int[] arr2 = new int[3];

			// input
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}

			System.out.println(result(arr1, arr2));
		}

	}

	// 접점 개수 구하는 함수
	public static int result(int[] arr1, int[] arr2) {
		int d = (int) (Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2));

		// case 1 : 중점이 같으면서 반지름도 같을 경우
		if (arr1[0] == arr2[0] && arr1[1] == arr2[1] && arr1[2] == arr2[2]) {
			return -1;
		}

		// case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
		else if (d > Math.pow(arr1[2] + arr2[2], 2)) {
			return 0;
		}

		// case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
		else if (d < Math.pow(arr2[2] - arr1[2], 2)) {
			return 0;
		}

		// case 3-1 : 내접할 때
		else if (d == Math.pow(arr2[2] - arr1[2], 2)) {
			return 1;
		}

		// case 3-2 : 외접할 때
		else if (d == Math.pow(arr1[2] + arr2[2], 2)) {
			return 1;
		} else {
			return 2;
		}

	}

}
