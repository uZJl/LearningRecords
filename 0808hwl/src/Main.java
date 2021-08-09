import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/8 14:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        if (total % num.length != 0) {
            System.out.println("-1");
        }
        int avg = total / num.length;
        int count = 0;
        int ans = 0;
        for (int i = 0; i < num.length; i++) {
            count = count + (num[i] - avg);
            ans = Math.max(
                    Math.max(ans, Math.abs(count)), num[i] - avg
            );
        }
        System.out.println(ans);
    }
}

