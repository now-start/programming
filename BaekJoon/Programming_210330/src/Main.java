import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int a = x;
            int b = (x - 1) % n + 1;
            int max = LCM(m, n);
            int result = -1;
            for (int j = a; j < max; j += m) {
                if (b == y) {
                    result = j;
                    break;
                }
                b = (b + m - 1) % n + 1;
            }

            System.out.println(result);
        }
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
