import java.io.*;
import java.util.StringTokenizer;

// 5523
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());

        int countA = 0;
        int countB = 0;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b) {
                countA++;
            } else if (a < b) {
                countB++;
            }
        }

        bw.write(countA + " " + countB);
        bw.flush();
    }

}
