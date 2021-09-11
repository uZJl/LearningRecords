import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/11 19:33
 * 题目描述：
 * 你在使用一个特殊的键盘输入一个字符串。键盘是一个矩形网格的形状，有各种不同的排列，
 * 每个按键上的字符互不相同，最多有 94 个按键（除空格外共有 94 个可见 ASCII 字符，
 * ASCII 码为 33~126）。你需要操作一个机械手来点击这个键盘，机械手可以上下左右移动，
 * 每移动一格耗时 x，移动过程中（不包括一开始或者点击前后）转向耗时 y，每次点击键盘耗时 z。
 * 一开始，机械手位于左上角。请计算打完这个字符串最少需要多少时间。
 * 输入描述
 * 第一行五个空格隔开的整数 n, m, x, y, z，0 < n * m <= 94，1 <= x, y, z <= 100000
 * 后面 n 行，每行一个由 m 个字符组成的字符串，表示键盘的配列，
 * 保证 m 个字符都是 ASCII 可见字符，不是空格且互不相同。
 * 最后一行一个由上述配列中存在的字符组成的字符串，长度不超过 100000。
 * 输出描述
 * 一个整数，表示最少需要的时间
 * 样例输入
 * 2 2 1 1 1
 * .E
 * :F
 * EE:F.:
 * 样例输出
 * 15
 * 提示
 * 步骤拆解
 * E→2   EE→3   EE: →7（移动中涉及了转向） EE:F→9   EE:F.→13（移动中涉及了转向） EE:F.:→15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int x = Integer.parseInt(a[2]);
        int y = Integer.parseInt(a[3]);
        int z = Integer.parseInt(a[4]);
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }
        String str = scanner.nextLine();
        HashMap<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.put(arr[i][j], new int[]{i, j});
            }
        }
        int[] start = new int[2];
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int[] end = map.get(c);
            int X = start[0];
            int Y = start[1];
            int X1 = end[0];
            int Y1 = end[1];
            if (X == X1 && Y == Y1) {
                ans += z;
            } else if (X == X1) {
                ans += Math.abs(Y1 - Y) * x + z;
                start = end;
            } else if (Y == Y1) {
                ans += Math.abs(X1 - X) * x + z;
                start = end;
            } else {
                ans +=  Math.abs(X1 - X) * x + Math.abs(Y1 - Y) * x + y + z;
                start = end;
            }
        }
        System.out.println(ans);
    }
//    private static int fun(char[][] arr, )
}
