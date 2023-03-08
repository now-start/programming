import java.io.*;
import java.util.StringTokenizer;

//3944
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            String d = st.nextToken();

            int result = 0;
            for (int i = 0; i < d.length(); i++) {
                result += d.charAt(i) - 48;
            }

            bw.write(result % (b - 1) + "\n");
        }

        bw.flush();
    }
}
