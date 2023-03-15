import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int i = 1;
        int count = 0;
        int result = 0;

        while (i < m - 1) {
            if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
                count++;
                if (count == n) {
                    result++;
                    count--;
                }
                i += 2;
            } else {
                count = 0;
                i++;
            }
        }

        System.out.println(result);
    }

}
