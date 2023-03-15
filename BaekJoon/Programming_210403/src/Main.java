import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            solve();
        }

    }

    private static void solve() {
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<Integer>();
        int count = 0;

        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            String d = sc.next();
            int num = sc.nextInt();

            if (d.equals("I")) {
                maxPriorityQueue.add(num);
                minPriorityQueue.add(num);
                count++;
            } else {
                if (num == 1) {
                    minPriorityQueue.remove(maxPriorityQueue.poll());
                    if (count > 0) count--;
                } else {
                    maxPriorityQueue.remove(minPriorityQueue.poll());
                    if (count > 0) count--;
                }
            }
        }

        if (count == 0) {
            System.out.println("EMPTY");
        } else {
            System.out.print(maxPriorityQueue.poll() + " " + minPriorityQueue.poll());
        }

    }

}
