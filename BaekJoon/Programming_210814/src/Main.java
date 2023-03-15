import java.util.Scanner;

// 4948
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // main
        while (n != 0) {
            System.out.println(PrimeNum(n));
            n = sc.nextInt();
        }
    }

    private static int PrimeNum(int n) {
        int count = 0;
        int[] arr = new int[2 * n + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = n + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        return count;
    }

}
