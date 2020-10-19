import java.util.Scanner;

public class Main {
	static int[] queue; // 큐에는 초기값 0이 들어간다
	static int index = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		queue = new int[n];

		for (int i = 0; i < n; i++) {
			String a = sc.next();

			switch (a) {
			case "push":
				int x = sc.nextInt();
				push(x);
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
		}

	}

	public static void push(int x) {
		queue[index] = x;
		index++;
	}

	public static void pop() {
		int result = -1;
		if (queue[0] != 0) {
			result = queue[0];

			for (int i = 0; i < index; i++) { // 큐에서 출력된 값을 제거하고
				queue[i] = queue[i + 1]; // 큐에 저장된 값을 앞으로 이동시킨다
			}
			if (index > 0) {
				index--;
			}
		}

		System.out.println(result);
	}

	public static void size() {
		System.out.println(index);
	}

	public static void empty() {
		int result = 1;
		if (queue[0] != 0) {
			result = 0;
		}

		System.out.println(result);
	}

	public static void front() {
		int result = -1;
		if (queue[0] != 0) {
			result = queue[0];
		}

		System.out.println(result);
	}

	public static void back() {
		int result = -1;
		if (queue[0] != 0) {
			result = queue[index - 1];
		}

		System.out.println(result);
	}
}
