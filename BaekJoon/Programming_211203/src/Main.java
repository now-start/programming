import java.io.*;

// 13985
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        int a = s.charAt(0) - 48;
        int b = s.charAt(4) - 48;
        int c = s.charAt(8) - 48;

        if (a + b == c) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
    }

}
