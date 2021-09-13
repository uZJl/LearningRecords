import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/13 20:14
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(1, str.length() - 1);
        String[] s = str1.split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = arr[arr.length - 1];
        int d = arr[arr.length - 2];
        System.out.println((c * d) - (a * b));
    }
}
