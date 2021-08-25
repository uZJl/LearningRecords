import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/25 19:43
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = fun(n);
        System.out.println(ans);
    }
    public static int fun (int n) {
        if (n <= 3) {
            return 1;
        } else {
            return fun(n - 2) + fun(n - 3);
        }

    }
}
