import java.io.*;
import java.util.Arrays;

import static java.lang.System.in;
import static java.lang.System.out;

// 25083
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    public static void main(String[] args) throws IOException {
        out.println("args = " + Arrays.deepToString(args));
    }
}
