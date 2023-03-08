import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.System.in;
import static java.lang.System.out;

// 1167
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
    static List<Link>[] list;
    static boolean[] visited;
    private static int max = 0;
    private static int start = 0;

    public static void main(String[] args) throws Exception {
        int count = Integer.parseInt(br.readLine());

        list = new ArrayList[count + 1];

        for (int i = 1; i <= count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            list[node] = new ArrayList<>();
            int m;
            while ((m = Integer.parseInt(st.nextToken())) != -1) {
                list[node].add(new Link(m, Integer.parseInt(st.nextToken())));
            }
        }

        visited = new boolean[count + 1];
        dfs(1, 0);

        visited = new boolean[count + 1];
        dfs(start, 0);

        bw.write(max + "");
        bw.flush();
    }

    private static void dfs(int i, int length) {
        visited[i] = true;

        if (length > max) {
            max = length;
            start = i;
        }

        for (Link next : list[i]) {
            if (!visited[next.m]) {
                dfs(next.m, length + next.dist);
                visited[next.m] = false;
            }
        }
    }

    public static class Link {
        int m;
        int dist;

        public Link(int m, int dist) {
            this.m = m;
            this.dist = dist;
        }
    }
}