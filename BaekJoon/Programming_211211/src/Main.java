import java.io.*;
import java.util.StringTokenizer;

// 2914
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int i = Integer.parseInt(st.nextToken());

        bw.write(a * (i - 1) + 1 + "");
        bw.flush();
    }

}
