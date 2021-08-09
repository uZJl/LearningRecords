import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/9 11:27
 */
public class Main {
    List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = 0;
        if (num > 0) {
            for (int i = 0; i < )
        }
    }
    private static int fun(int num, int ans) {
        while (num > 0) {
            int temp = num % 10;
            list.add(temp);
            num /= 10;
        }
    }
}
