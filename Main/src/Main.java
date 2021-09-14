import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/14 17:25
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                flag = false;
                System.out.println(i);
                break;
            }
        }
        if (flag) {
            System.out.println(-1);
        }
    }
}
