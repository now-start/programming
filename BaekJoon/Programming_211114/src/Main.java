import java.io.*;
import java.util.StringTokenizer;

// 1712
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (b >= c) {
            bw.write("-1");
        } else {
            bw.write(a / (c - b) + 1 + "");
        }

        bw.flush();
    }
}