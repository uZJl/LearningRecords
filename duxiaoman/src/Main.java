import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/5 15:20
 * 有若干个宝石制成的字母，你想用它们拼出公司的名字作为纪念。
 * 并且，你想尽可能地多拼几遍。当然，它们不能被重复使用。字母区分大小写。
 * 已知公司的名称和你拥有的宝石字母，请计算最多可以拼多少遍公司的名字。
 * 在拼完之后，可能还剩下一部分字母，请计算这部分字母的种类数。
 * 输入描述
 * 两行，每行一个字符串。
 * 两个字符串均为字母组成，第一个字符串表示公司名称，长度不超过 1000，
 * 第二个字符串中每个字母表示一个你有的宝石字母，长度不超过 1000000
 * 输出描述
 * 空格隔开的两个整数，分别表示最多可以拼的遍数，剩下的字母种类数
 * 样例输入
 * Mozilla
 * MMMooozzziiilllllaaaswR
 * 样例输出
 * 2 9
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        HashSet<Character> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!set.contains(c)) {
                min = Math.min(min, map2.get(c) / map1.get(c));
            }
            set.add(c);
        }
        HashSet<Character> set1 = new HashSet<>();
        int count = 0;
        char[] arr1 = s2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            char c = arr1[i];
            if (!set1.contains(c)) {
                if (!map1.containsKey(c)) {
                    count++;
                } else if (map2.get(c) - map1.get(c) * min > 0) {
                    count++;
                }
            }
            set1.add(c);
        }
        System.out.println(min + " " + count);
    }
}
