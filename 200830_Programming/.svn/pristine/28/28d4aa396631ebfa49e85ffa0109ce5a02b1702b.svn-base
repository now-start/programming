import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < 9; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}

		System.out.println(arr[max]);
		System.out.println(max+1);
	}

}
