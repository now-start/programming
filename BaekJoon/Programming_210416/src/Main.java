import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> plusPriorityQueue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> minusPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if (x > 0) {
				plusPriorityQueue.add(x);
			} else if (x < 0) {
				minusPriorityQueue.add(x);
			} else {
				if (plusPriorityQueue.isEmpty() && minusPriorityQueue.isEmpty()) {
					bw.write(0 + " ");
				} else if (plusPriorityQueue.isEmpty()) {
					bw.write(minusPriorityQueue.poll() + " ");
				} else if (minusPriorityQueue.isEmpty()) {
					bw.write(plusPriorityQueue.poll() + " ");
				} else {
					if (plusPriorityQueue.peek() < -1 * minusPriorityQueue.peek()) {
						bw.write(plusPriorityQueue.poll() + " ");
					} else {
						bw.write(minusPriorityQueue.poll() + " ");
					}
				}
			}

		}

		bw.flush();
	}

}
