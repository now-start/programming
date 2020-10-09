import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new LinkedList<Integer>(); // ArrayList 사용시 삭제 및 추가로 인한 시간 초과

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		for (int i = 0; i < n - 1; i++) {
			list.remove(0);
			list.add(list.get(0));
			list.remove(0);
		}

		System.out.println(list.get(0));
	}

}
