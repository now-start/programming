import java.io.IOException;
import java.util.Scanner;

//1244
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sw = new int[n + 1];

        // input
        for (int i = 1; i <= n; i++) {
            sw[i] = sc.nextInt();
        }

        // main
        int t = sc.nextInt();
        while (t-- > 0) {
            int gender = sc.nextInt();
            int index = sc.nextInt();
            // 1 : ��, 2 : ��
            if (gender == 1) {
                for (int i = index; i <= n; i += index) {
                    sw[i] ^= 1;
                }
            } else {
                sw[index] ^= 1;
                for (int i = 1; 0 < index - i && index + i <= n; i++) {
                    if (sw[index + i] == sw[index - i]) {
                        sw[index + i] ^= 1;
                        sw[index - i] ^= 1;
                    } else {
                        break;
                    }
                }

            }
        }

        // output
        for (int i = 1; i <= n; i++) {
            System.out.print(sw[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

}
