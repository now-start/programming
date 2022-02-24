import java.io.*;

//1094
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());

        bw.write(Integer.bitCount(x) + "");
        bw.flush();
    }
}
