import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//1064
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[][] arr = new double[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Double.parseDouble(st.nextToken());
            }
        }
        if ((arr[1][1] - arr[0][1]) * (arr[2][0] - arr[1][0]) == (arr[1][0] - arr[0][0]) * (arr[2][1] - arr[1][1])) {
            bw.write("-1.0");
        } else {
            double[] dist = distances(arr);
            Arrays.sort(dist);

            bw.write((dist[2] - dist[0]) * 2 + "");
        }

        bw.flush();
    }

    private static double[] distances(double[][] arr) {
        double[] dist = new double[3];

        dist[0] = Math.sqrt(Math.pow(arr[0][0] - arr[1][0], 2) + Math.pow(arr[0][1] - arr[1][1], 2));
        dist[1] = Math.sqrt(Math.pow(arr[1][0] - arr[2][0], 2) + Math.pow(arr[1][1] - arr[2][1], 2));
        dist[2] = Math.sqrt(Math.pow(arr[2][0] - arr[0][0], 2) + Math.pow(arr[2][1] - arr[0][1], 2));

        return dist;
    }
}
