import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/21 11:22
 * 题目描述：
 * 小红书每周四会给同学们发放零食水果，假设我们的工位是一个N*N的形状，
 * 并且有一些工位上是空的。阿姨会从左上角的工位开始发零食，
 * 每次向一个相邻（上下左右四个方向）的工位移动。为了零食能尽快发完，
 * 阿姨希望只经过有同学在的工位并且每个工位只经过一次，
 * 最后一个收到零食的同学也需要是在最后一排，请问阿姨总共有多少种移动的方案？
 * 输入描述
 * 第一行一个整数N (0<N<=7)
 * 接下来是N*N个字符，“.”代表这个工位有人，“#”代表这个工位是空的。
 * 输出描述
 * 一个整数，代表总共的方案数
 * 样例输入
 * 3
 * ..#
 * ..#
 * ...
 * 样例输出
 * 1
 * 提示
 * 从左上角(1,1)位置开始，依次经过(1,2), (2,2), (2,1), (3,1), (3,2), (3,3)
 */
public class Main1 {
    public static int[][] op = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static int res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }
        fun(arr, 0, 0);
        System.out.println(res);

    }
    public static void fun(char[][] arr, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] == '#') {
            return;
        }
        if (help(arr)) {
            res++;
            return;
        }
        if (arr[i][j] == '.') {
            char temp = arr[i][j];
            arr[i][j] = '#';
            for (int k = 0; k < op.length; k++) {
                fun(arr, i + op[k][0], j + op[k][1]);
            }
            arr[i][j] = temp;
        }
    }
    public static boolean help(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
