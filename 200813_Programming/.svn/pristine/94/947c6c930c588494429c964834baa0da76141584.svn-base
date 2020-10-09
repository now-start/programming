import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 현재 위치 (x, y)
		int y = sc.nextInt();
		int w = sc.nextInt(); // 왼쪽 아래 꼭짓점(0, 0)
		int h = sc.nextInt(); // 오른쪽 위 꼭짓점(w, h)
		int min = Integer.MAX_VALUE;

		// 경계선은 상하좌우 총 4개
		min = Math.min(Math.min(w - x, h - y), Math.min(x, y));

		System.out.println(min);
	}

}
