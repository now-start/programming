import java.util.Arrays;
import java.util.Scanner;

//1377
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // input
        int[][] a = new int[n][2]; // num, index
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = i;
        }

        // main
        Arrays.sort(a, (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else {
                return -1;
            }
        });

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, a[i][1] - i);
        }

        System.out.println(result + 1);
    }
}