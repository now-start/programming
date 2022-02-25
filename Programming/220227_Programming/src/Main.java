import java.io.*;
import java.util.*;

//14713
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Queue<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Queue<String> queue = new LinkedList<>();
            Collections.addAll(queue, br.readLine().split(" "));

            list.add(queue);
        }

        Queue<String> str = new LinkedList<>();
        Collections.addAll(str, br.readLine().split(" "));
        int len = str.size();

        for (int i = 0; i < len; i++) {
            for (Queue<String> queue : list) {
                if (str.peek() != null && str.peek().equals(queue.peek())) {
                    str.poll();
                    queue.poll();
                    break;
                }
            }
        }

        boolean flag = str.isEmpty();
        for (Queue<String> queue : list) {
            if (!queue.isEmpty()) {
                flag = false;
                break;
            }
        }

        if (flag) {
            bw.write("Possible");
        } else {
            bw.write("Impossible");
        }
        bw.flush();
    }
}
