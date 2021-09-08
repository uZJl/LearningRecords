import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/8 19:30
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = str.replaceAll(" ", "%20");
        System.out.println(s);
    }
}
