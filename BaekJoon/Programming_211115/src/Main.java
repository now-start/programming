import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 10699
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        LocalDate date = LocalDate.now();
        bw.write(date.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
        bw.flush();
    }

}
