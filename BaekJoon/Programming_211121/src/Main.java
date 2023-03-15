import java.io.*;
import java.util.StringTokenizer;

// 2845 
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(st.nextToken());

            bw.write(temp - l * p + " ");
        }

        bw.flush();
    }

}
