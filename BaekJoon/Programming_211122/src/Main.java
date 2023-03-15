import java.io.*;
import java.util.StringTokenizer;

// 1009
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int c = 1;
            for (int i = 1; i <= b; i++) {
                c = (c * a) % 10;
            }

            if (c == 0) {
                bw.write(c + 10 + "\n");
            } else {
                bw.write(c + "\n");
            }
        }

        bw.flush();
    }

}
