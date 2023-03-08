import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;
import static java.lang.System.out;

// 2022
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());


        double left = 0;
        double right = Math.min(x, y);

        while (right - left >= 0.001) {
            double width = (left + right) / 2;
            double h1 = Math.sqrt(Math.pow(x, 2) - Math.pow(width, 2));
            double h2 = Math.sqrt(Math.pow(y, 2) - Math.pow(width, 2));
            double res = (h1 * h2) / (h1 + h2);

            if (res >= c) left = width;
            else right = width;
        }

        bw.write(String.format("%.3f", right));
        bw.flush();
    }
}
