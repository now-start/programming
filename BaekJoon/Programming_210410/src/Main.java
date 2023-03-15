import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];

        while (m-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            boolean check = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    check = false;
                }
            }
            if (check) {
                arr[i][i] = 1;
            }
        }

        int result = BFS(arr);

        System.out.println(result);
    }

    private static int BFS(int[][] arr) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    result++;
                    queue.add(j);
                    while (!queue.isEmpty()) {
                        int temp = queue.poll();
                        for (int k = 1; k < arr.length; k++) {
                            if (arr[temp][k] == 1) {
                                arr[temp][k] = arr[k][temp] = 0;
                                queue.add(k);
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

}
