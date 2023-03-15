import java.io.*;
import java.util.StringTokenizer;

//1120
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();

        int count = 0;

        if (n.length() == m.length()) {
            count = getCount(n, m, count);
        } else {
            count = Integer.MAX_VALUE;

            for (int i = 0; i <= m.length() - n.length(); i++) {
                int match = 0;
                match = getCount(n, m.substring(i, i + n.length()), match);
                count = Math.min(count, match);
            }
        }

        bw.write(count + "");
        bw.flush();
    }

    private static int getCount(String n, String m, int count) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != m.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
