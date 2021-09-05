import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/5 15:45
 * 题目描述：
 * 黄大胆在当巡逻员。
 * 黄大胆想知道有多少种方法可以从1号点出发将图中所有点不重不漏地走一遍。
 * 我们定义两种走法不同当且仅当经过点的顺序不一样。
 * 请你帮帮黄大胆！
 * 输入描述
 * 第一行两个数n(2≤n≤18),m(1≤m≤n(n-1)/2)。代表图中的点数和边数。
 * 接下来m行每行有两个数u v，代表图中有一条连接着u和v的无向边。
 * 输出描述
 * 输出一个数，代表不同走法的数量。
 * 样例输入
 * 4 6
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 * 2 3
 * 样例输出
 * 6
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < arr.length; i++) {
            String[] s = scanner.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

    }
}
