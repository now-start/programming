import java.io.*;

//5554
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int time = 0;

        for (int i = 0; i < 4; i++) {
            time += Integer.parseInt(br.readLine());
        }

        int minute = time / 60;
        int second = time % 60;

        bw.write(minute + "\n" + second);
        bw.flush();
    }
}
