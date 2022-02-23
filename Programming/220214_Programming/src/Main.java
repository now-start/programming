import java.io.*;

//6749
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int last = Integer.parseInt(br.readLine());
        int mid = Integer.parseInt(br.readLine());

        int sequence = mid - last;

        int first = mid + sequence;

        bw.write(first + "");
        bw.flush();
    }
}
