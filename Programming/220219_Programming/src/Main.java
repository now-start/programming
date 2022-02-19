import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        bw.write(sum + "");
        bw.flush();
    }
}
