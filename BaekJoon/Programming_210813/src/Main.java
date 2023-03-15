import java.util.Arrays;
import java.util.Scanner;

// 2075
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * n];

        for (int i = 0; i < n * n; i++) {
            arr[i] = sc.nextInt();
        }

        // main
        Arrays.sort(arr);
        System.out.println(arr[arr.length - n]);
    }

}
