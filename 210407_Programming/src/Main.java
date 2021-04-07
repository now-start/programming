import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

		while (n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				Integer temp = priorityQueue.poll();
				System.out.println(temp == null ? 0 : temp);
			} else {
				priorityQueue.add(x);
			}
		}
	}

}
