import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int abc = a * b * c;
		int arr[] = new int[10];

		for (int i = 0; i <= 9; i++) {
			if ((int)(abc / Math.pow(10, i)) == 0) {
				break;
			}
			arr[(int) (abc / Math.pow(10, i)) % 10]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}

}
