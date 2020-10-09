import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// B진법 수 N
		String b = sc.next();
		int n = sc.nextInt();
		long sum = 0;
		int j = 0;

		for (int i = b.length() - 1; i >= 0; i--) { // 1의 자리 수 부터 시작한다
			int number = b.charAt(i);
			if ('A' <= number && number <= 'Z') {// A~Z일경우 숫자로 변환한다.
				sum += Math.pow(n, j) * (number - 'A' + 10);
			} else { // 0~9일경우 숫자로 변환한다.
				sum += Math.pow(n, j) * (number - '0');
			}
			j++;
		}
		System.out.println(sum);
	}
}
