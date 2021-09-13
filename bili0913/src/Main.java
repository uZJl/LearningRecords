import java.util.*;

/**
 * Created by JiaLe on 2021/9/13 19:34
 * 题目描述：
 * 给定英文句子S和字符串x，判断x是否为S中某些单词的后缀，若匹配到则输出所有匹配单词的位置，
 * 否则输出-1。
 *
 * 例如：输入"this is an easy problem."和"is"，输出[0,5]
 *
 * 例如：输入"In love folly is always sweet"和"an"，输出[]
 *
 * 例如：输入"Whatever is worth doing is worth doing well."和"well"，输出[39]
 *
 *
 *
 * 输入描述
 * 输入包含两行，第一行为S，第二行为x
 *
 * 长度不超过10000
 *
 * 输出描述
 * int型数组
 *
 *
 * 样例输入
 * No one and you.
 * ""
 * 样例输出
 * []
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String x = scanner.nextLine();
        String[] arr = S.split(" ");
        if (x.equals("") || x == null) {
            System.out.println(new int[]{});
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(arr[i].length() - 1);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                continue;
            } else {
                String s = arr[i].substring(0, arr[i].length() - 2);
                arr[i] = new String(s);
            }
        }
        List<Integer> list = new ArrayList<>();
        int len = x.length();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= len) {
                int cut = arr[i].length() - len;
                String temp = arr[i].substring(cut);
                if (temp.equals(x)) {
                    list.add(i);
                }
            }
        }
//        for (int num : list) {
//            System.out.println(num);
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int index = 1;
        int length = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            map.put(i, index + length);
            length += arr[i].length();
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = map.get(list.get(i));
        }
        System.out.println(Arrays.toString(ans));
    }
}
