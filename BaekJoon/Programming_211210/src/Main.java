import java.io.*;

// 2558
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        bw.write(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + "");
        bw.flush();
    }

}
