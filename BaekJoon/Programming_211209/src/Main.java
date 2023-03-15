import java.io.*;
import java.math.BigInteger;

// 2338
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        bw.write(a.add(b) + "\n");
        bw.write(a.subtract(b) + "\n");
        bw.write(a.multiply(b) + "");
        bw.flush();
    }

}
