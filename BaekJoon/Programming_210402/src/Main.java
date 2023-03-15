import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        char[][] arr = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'}, {'A', 'T', 'C', 'G'},
                {'G', 'A', 'G', 'T'}};
        int n = sc.nextInt();
        String temp = sc.next();

        for (int i = 0; i < n; i++) {
            stack.push(temp.charAt(i));
        }

        while (stack.size() != 1) {
            int a = 0, b = 0;
            char x = stack.pop();
            char y = stack.pop();

            if (x == 'A') {
                a = 0;
            } else if (x == 'G') {
                a = 1;
            } else if (x == 'C') {
                a = 2;
            } else {
                a = 3;
            }
            if (y == 'A') {
                b = 0;
            } else if (y == 'G') {
                b = 1;
            } else if (y == 'C') {
                b = 2;
            } else {
                b = 3;
            }

            stack.push(arr[a][b]);
        }

        System.out.println(stack.pop());
    }
}