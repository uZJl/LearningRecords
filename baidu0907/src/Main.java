import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JiaLe on 2021/9/7 19:35
 * 题目描述：
 * Kimi的英语老师是一个非常有趣的人。每一次考试之前她都会在不经意间透露一下试题的难度，
 * 她会在黑板上写一串长长的字符。你需要从这串字符中按照次序找到E或e、A或a、S或s、Y或y这四个字母，
 * 每四个字母为一组，将构成一个大家熟悉的单词（easy）。每找到一组字母，即构成一个单词easy
 * 则容易等级加1。当然，容易等级越大就意味着考试题目越容易，所以Kimi希望能够从中找到最多的字母组合。
 * 值得注意的是如果有多于一个easy，每一个easy都需要按照次序出现，也就是说下一个easy中的“e”必须在
 * 前一个easy中的“y”之后出现。 你能否编写一个程序告诉Kimi这次英语考试的容易等级是多少呢？
 * 输入描述
 * 输入一个长度为n的字符串，n<=1000。
 * 输出描述
 * 输出一个非负整数表示此次英语考试的容易等级。
 * 样例输入
 * abcdesAssayEaaaassYyy
 * 样例输出
 * 2
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        char[] arr = str.toCharArray();
        int count = 0;
        int i = 0;
        while (i < arr.length){
            char c = arr[i];
            if (c == 'e' && arr.length - i - 1 >= 3) {
                Stack<Character> stack = new Stack<>();
                stack.push('y');
                stack.push('s');
                stack.push('a');
                int j = i + 1;
                for (; j < arr.length; j++) {
                    char c1 = arr[j];
                    if (c1 == stack.peek()) {
                        stack.pop();
                    }
                    if (stack.empty()) {
                        count++;
                        break;
                    }
                }

                i = j + 1;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
