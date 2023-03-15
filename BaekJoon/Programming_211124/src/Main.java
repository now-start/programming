import java.io.*;

// 1032
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        for (int i = 0; i < s[0].length(); i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                if (s[j].charAt(i) != s[j + 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                bw.write(s[0].charAt(i));
            } else {
                bw.write("?");
            }
        }

        bw.flush();
    }

}
