import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2230
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // main
        // ����
        Arrays.sort(arr);
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        while (i < n) {
            if (arr[i] - arr[j] < m) {
                i++;
                continue;
            }

            if (arr[i] - arr[j] == m) {
                min = m;
                break;
            }

            min = Math.min(min, arr[i] - arr[j]);
            j++;
        }

        bw.write(min + "");
        bw.flush();
    }

}
