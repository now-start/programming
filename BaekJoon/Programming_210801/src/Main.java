import java.util.Scanner;

//9663
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] board = new int[n];
        int count = backTraking(0, board);
        System.out.println(count);
    }

    public static int backTraking(int count, int[] board) {
        int sum = 0;

        if (count == board.length) {
            return 1;
        }

        for (int i = 0; i < board.length; i++) {
            board[count] = i;
            if (check(count, board)) {
                sum += backTraking(count + 1, board);
            }
        }

        return sum;
    }

    private static boolean check(int count, int[] board) {
        boolean check = true;

        // ���� �� �� �밢�� �˻�
        for (int i = 0; i < count; i++) {
            if (board[i] == board[count] || Math.abs(board[i] - board[count]) == Math.abs(i - count)) {
                check = false;
                return check;
            }
        }

        return check;
    }
}
