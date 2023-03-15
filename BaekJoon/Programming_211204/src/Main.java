import java.io.*;

// 14681
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > 0 && b > 0) {
            bw.write("1");
        } else if (a < 0 && b > 0) {
            bw.write("2");
        } else if (a < 0 && b < 0) {
            bw.write("3");
        } else {
            bw.write("4");
        }

        bw.flush();
    }

}
