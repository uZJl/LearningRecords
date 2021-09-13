import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/13 20:07
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int[] arr = {1, 6 , 8, 10, 12, 13, 14, 15, 17, 18, 19};
        if (k > 11 || k <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr[k - 1]);
        }
    }
}
