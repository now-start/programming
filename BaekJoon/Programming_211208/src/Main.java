import java.io.*;

// 1550
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        bw.write(Integer.parseInt(br.readLine(), 16) + "");
        bw.flush();
    }

}
