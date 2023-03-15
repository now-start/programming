import java.util.Scanner;

//2512
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int budget = sc.nextInt();

        // main
        int start = 0;
        int end = max;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < mid) {
                    sum += arr[i];
                } else {
                    sum += mid;
                }
            }

            if (budget < sum) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(end);
    }

}