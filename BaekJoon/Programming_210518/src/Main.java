import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];

        DFS(arr, n, 0, 0);

    }

    public static void DFS(int[] arr, int n, int index, int now) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = now + 1; i <= n; i++) {
            arr[index] = i;
            DFS(arr, n, index + 1, i);
        }
    }

}