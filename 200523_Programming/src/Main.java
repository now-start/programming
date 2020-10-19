public class Main {
	public static void main(String[] args) {
		boolean[] list = new boolean[10036]; // 셀프 넘버인지 조사

		// 셀프 넘버는 10000보다 작거나 같다
		for (int i = 1; i <= 10000; i++) {
			list[i + (i / 1000) + (i % 1000 / 100) + (i % 100 / 10) + (i % 10)] = true;
		}

		// 출력문
		for (int i = 1; i <= 10000; i++) {
			if (!list[i]) {
				System.out.println(i);
			}
		}
	}
}
