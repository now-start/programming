import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] point = new Point[n];

		for (int i = 0; i < n; i++) {
			point[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(point);
		for (int i = 0; i < n; i++) {
			System.out.println(point[i].x + " " + point[i].y);
		}
	}
}

class Point implements Comparable<Point> {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if (this.x > o.x) {
			return 1;
		} else if (this.x == o.x) {
			if (this.y > o.y) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
}
