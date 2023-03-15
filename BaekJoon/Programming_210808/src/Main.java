import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//2493
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // main
        for (int i = 1; i <= n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty() && stack.peek()[1] < temp) {
                stack.pop();
            }
            bw.write(stack.isEmpty() ? 0 + " " : stack.get(stack.size() - 1)[0] + " ");
            stack.push(new int[]{i, temp});
        }

        bw.flush();

    }

}