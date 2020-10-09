import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		Set<Integer> arr1 = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			arr1.add(sc.nextInt());
		}

		m = sc.nextInt();
		int[] arr2 = new int[m];

		for (int i = 0; i < m; i++) {
			arr2[i]=sc.nextInt();
		}

		compare(arr1, arr2);
	}

	// arr2에 있는 숫자가 arr1에 있는지 확인한다
	// 속도를 위해 검색 대상이 되는 배열에 set을 사용했음
	static void compare(Set<Integer> arr1, int[] arr2) {

		for (int i = 0; i < m; i++) {
			if (arr1.contains(arr2[i])) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
