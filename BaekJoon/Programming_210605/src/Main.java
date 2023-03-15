import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();

        // main
        long result = n;
        for (int i = 0; i < n; i++) {
            double temp = a[i] - b;
            if (temp > 0) {
                result += Math.ceil(temp / c);
            }
        }

        System.out.println(result);
    }

}
