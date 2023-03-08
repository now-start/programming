import java.io.*;

//1356
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String num = br.readLine();
        boolean flag = false;

        //split
        for (int i = 1; i < num.length(); i++) {
            String a = num.substring(0, i);
            String b = num.substring(i);

            if (multiple(a) == multiple(b)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
    }

    private static int multiple(String a) {
        int result = 1;
        for (int i = 0; i < a.length(); i++) {
            result *= Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        return result;
    }
}
