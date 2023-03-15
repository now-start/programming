import java.io.*;
import java.util.StringTokenizer;

// 1934
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd; // 최대공약수
            int lcm; // 최소공배수

            // 유클리우드 호제법
            if (a >= b) {
                gcd = getGcd(a, b);
            } else {
                gcd = getGcd(b, a);
            }
            lcm = a * b / gcd;
            bw.write(lcm + "\n");
        }

        bw.flush();
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

}
