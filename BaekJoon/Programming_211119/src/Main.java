import java.io.*;
import java.time.LocalTime;
import java.util.StringTokenizer;

// 2525
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int minutesToAdd = Integer.parseInt(br.readLine());

        LocalTime time = LocalTime.of(hour, minute);
        time = time.plusMinutes(minutesToAdd);

        bw.write(time.getHour() + " " + time.getMinute());
        bw.flush();
    }

}
