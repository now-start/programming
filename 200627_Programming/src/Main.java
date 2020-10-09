import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 보석 개수
		int k = sc.nextInt(); // 가방 개수

		Jewelry[] jewel = new Jewelry[n];
		int[] bag = new int[k];

		for (int i = 0; i < n; i++) {
			int weight = sc.nextInt();
			int price = sc.nextInt();
			Jewelry jewelry = new Jewelry(weight, price);
			jewel[i] = jewelry;
		}
		for (int i = 0; i < k; i++) {
			bag[i] = sc.nextInt();
		}

		Arrays.sort(jewel); // 무개을 기준으로 오름차순 정렬
		Arrays.sort(bag);// 무개를 기준으로 오름차순 정렬

		long sum = 0;
		int index = 0;
		PriorityQueue<Integer> price = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			while (index < n) {
				if (bag[i] >= jewel[index].weight) {
					price.add(-(jewel[index].price)); // 넣을때 큰 가격부터 꺼내기 위해 음수로 넣는다.
					index++;
				} else {
					break;
				}
			}

			if (!price.isEmpty()) { // 가방의 무게보다 더 무거운 보석들만 있을 수 있으므로
				sum += Math.abs(price.poll()); // 우선순위큐에서는 낮은 가격부터 꺼내오므로 절댓값을 씌우면 가장 큰 값
			}
		}

		System.out.println(sum);
	}
}

class Jewelry implements Comparable<Jewelry> {
	int weight;
	int price;

	public Jewelry(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}

	@Override
	public int compareTo(Jewelry arg0) {
		if (this.weight <= arg0.weight) {
			return -1;
		} else {
			return 1;
		}
	}

}