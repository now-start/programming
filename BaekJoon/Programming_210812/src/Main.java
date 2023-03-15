import java.util.Scanner;

// 1439
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int zero = 0;
        int one = 0;

        // main
        if (s.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (s.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }

        System.out.println(Math.min(zero, one));
    }

}