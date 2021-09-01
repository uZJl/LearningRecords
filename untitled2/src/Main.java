import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/1 17:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> ans = fun(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.println(ans.get(arr[i]));
        }
    }
    private static HashMap<Character, Integer> fun (char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }
}
