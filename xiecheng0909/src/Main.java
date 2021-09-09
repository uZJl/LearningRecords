import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JiaLe on 2021/9/9 19:01
 * 题目描述：
 * 现在小程在运营一个游戏，游戏需要向含有特定关键词的用户发放惊喜福利。
 *
 * 现在给定你所有用户的用户名和需要检测的关键词。
 *
 * 你的任务是反馈给运营，本次发放会发放福利给多少名用户。
 *
 * 用户名仅含有大小写字母和数字。关键词仅包含字母，且关键词检测不区分大小写。
 * 输入描述
 * 第一行一个正整数n表示游戏有n个用户，一个字符串s表示需要检测的关键词。中间有空格隔开。
 * 接下来n行每行一个字符串，为n个用户名。
 * 输出描述
 * 一行一个正整数表示本次发放会发放福利给多少名用户。
 * 样例输入
 * 4 hAppy
 * happy01
 * bad02
 * happ03
 * hAPPY66
 * 样例输出
 * 2
 * 提示
 * 第一个用户happy01和第四个用户hAPPY66将获得福利。

 * 保证所有的字符串仅包含大小写字符和数字，长度不超过30
 *
 * 1 <= n <= 500
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int n = Integer.parseInt(a[0]);
        char[] flag = a[1].toLowerCase().toCharArray();
        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine().toLowerCase());
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            Stack<Character> stack = new Stack<>();
            for (int m = flag.length - 1; m >= 1; m--) {
                stack.push(flag[m]);
            }
            for (int j = 0; str.length() - j - 1 >= flag.length - 1; j++) {
                char c = str.charAt(j);
                if (c == flag[0]) {
                    if (!stack.isEmpty()) {
                        stack.clear();
                    } else {
                        break;
                    }
                    for (int m = flag.length - 1; m >= 1; m--) {
                        stack.push(flag[m]);
                    }
                    for (int k = j + 1; k < str.length(); k++) {
                        char c1 = str.charAt(k);
                        if (c1 == stack.peek()) {
                            stack.pop();
                        } else {
                            break;
                        }
                        if (stack.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
