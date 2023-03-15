import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int[] arr = new int[m];
        boolean[] visits = new boolean[n];

        // input
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        // main
        DFS(num, arr, visits, 0);

    }

    public static void DFS(int[] num, int[] arr, boolean[] visits, int index) {

        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if (!visits[i]) {
                visits[i] = true;
                arr[index] = num[i];
                DFS(num, arr, visits, index + 1);
                visits[i] = false;
            }
        }
    }

}