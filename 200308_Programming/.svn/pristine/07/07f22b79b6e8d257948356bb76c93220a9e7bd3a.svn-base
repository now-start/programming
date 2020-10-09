import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 동전의 총 종류 ex)1, 5, 10, 50, 100, ... 1000000
		int k = sc.nextInt(); // N가지의 동전으로 만들 값
		int[] arr = new int[n]; // 동전의 종류
		int count = 0; // 동전 개수의 최솟값
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//나누어 떨어지는 돈의 개수 구하기
		for (int i = n-1; i >= 0; i--) {
			if (k / arr[i] != 0) {
				count += k / arr[i];	//돈이 나누어 진다면 나누어지는 개수만큼 카운트에 추가
				//k -= k/arr[i]*arr[i];	//카운트에 추가한 만큼 원래 돈에서 빼기
				k %= arr[i];
			}
		}

		System.out.println(count);
	}

}
