import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/10 19:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            HashMap<Character, Integer> map1 = help(temp);
            for (int j = i + 1; j < arr.length - 1; j++) {
                String temp2 = arr[j];
                HashMap<Character, Integer> map2 = help(temp2);
                for (char ch : temp2.toCharArray()) {
                    if (map1.get(ch) != map2.get(ch))
                }
            }
        }
    }
    private static HashMap<Character, Integer> help(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
}
