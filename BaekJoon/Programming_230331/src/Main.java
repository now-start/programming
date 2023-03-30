import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    static int n;
    static List<Node>[] list;
    static boolean[] visit;
    static int ans;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        list = new ArrayList<>[n + 1];
        IntStream.range(1, n + 1).forEach(i -> list[i] = new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            list[from].add(new Node(to, len));
            list[to].add(new Node(from, len));
        }
        ans = 0;
        int bound = n;
        IntStream.rangeClosed(1, bound).forEach(i -> {
            visit = new boolean[n + 1];
            visit[i] = true;
            dfs(i, 0);
        });
        System.out.println(ans);
    }

    private static void dfs(int num, int dim) {
        list[num].stream().filter(node -> !visit[node.num]).forEach(node -> {
            visit[node.num] = true;
            dfs(node.num, dim + node.len);
        });
        ans = Math.max(ans, dim);
    }

    static class Node {
        int num;
        int len;

        public Node(int num, int len) {
            this.num = num;
            this.len = len;
        }
    }
}