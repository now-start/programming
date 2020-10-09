import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // test case
		int n; // 학생의 수 (1 <= n <= 1000)
		int score[]; // 점수
		int sum;
		double avg;
		int count;
		double result[] = new double[c];

		for (int i = 0; i < c; i++) {
			sum = 0;
			avg = 0;
			count = 0;

			n = sc.nextInt();
			score = new int[n];
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = (double)sum / n;

			for (int j = 0; j < score.length; j++) {
				if (score[j] > avg) {
					count++;
				}
			}
			result[i] = (double)count / n * 100;

		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.format("%.3f", result[i]) + "%");
		}
	}

}
