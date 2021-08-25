import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/25 19:57
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = 0;
        int flag = fun(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = fun(s.charAt(i));
            if (num > flag) {
                ans -= flag;
            } else {
                ans += flag;
            }
            flag = num;
        }
        ans += flag;
        System.out.println(ans);

    }
    public static int fun (char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;


        }
    }
}
