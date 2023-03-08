import java.io.*;

//1110
public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int newNum = num;
        int count = 1;

        //new num
        while (true) {
            int a = newNum / 10; //10의 자리 수
            int b = newNum % 10; //1의 자리 수

            newNum = (b * 10) + (a + b) % 10;

            if (num == newNum) {
                break;
            }
            count++;
        }

        bw.write(count + "");
        bw.flush();
    }
}
