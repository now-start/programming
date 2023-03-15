import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1485
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            ArrayList<Point> pointList = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                pointList.add(new Point(x, y));
            }

            double[] len = new double[6];
            int count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    len[count++] = calculateDistance(pointList.get(i), pointList.get(j));
                }
            }

            boolean isSquare = true;
            Arrays.sort(len);
            for (int i = 1; i < 4; i++) {
                if (len[0] != len[i]) {
                    isSquare = false;
                }
            }

            if (len[4] != len[5]) {
                isSquare = false;
            }

            if (isSquare) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }
        bw.flush();

    }

    static double calculateDistance(Point point1, Point point2) {
        int dx = point1.x - point2.x;
        int dy = point1.y - point2.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}