import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] pn = new int[m + 1]; // 0이면 소수 1이면 소수가 아님
		pn[1] = 1;

		//에라토스테네스의 체를 이용
		for (int i = 2; i <= m; i++) {
			if (pn[i] == 0) {
				if (i >= n) {
					System.out.println(i);
				}

				for (int j = 1; i * j <= m; j++) {
					pn[i * j] = 1;
				}
			}
		}

	}
}
