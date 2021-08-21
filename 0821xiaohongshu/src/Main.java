import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/21 10:12
 * 题目描述：
 * 魔法世界里有一位魔法师, 他要踏着河中间的几块石头走到对岸.有的石头上放了一块白水晶,
 * 有的石头上放了一块黑水晶, 还有的石头上什么也没有放.
 * 魔法师需要将空的石头上放上一块黑水晶或者白水晶,使得黑水晶和白水晶的个数是一样, 这样才能过河.
 * 但空的石头上放上黑水晶或者白水晶需要消耗魔法师的能量,
 * 并且不同的石头上面放白水晶和黑水晶所需要的能量是不一样的.
 * 输入会给出所有石头上的水晶颜色,如果是空的话,会分别给出魔法师放黑水晶和白水晶所需要的能量.
 * 你的程序需要输出魔法师过河所需要的最少能量, 如果无法过河, 则输出-1.
 * 输入描述
 * 第一行表示石头的个数. (0 < N < 5000000)
 * 从第二行开始有N行, 每一行的第一个数字代表水晶颜色, 1=白, 2=黑, 0=空, 如果是空的话,
 * 这一行的第2和第3个数字分别表示放置白水晶和黑水晶所需要的能量
 * 输出描述
 * 输出需要的最小能量值. 如果不能过河, 则输出-1.
 * 样例输入
 * 10
 * 1
 * 1
 * 0 1 2
 * 2
 * 2
 * 2
 * 1
 * 0 2 4
 * 0 2 8
 * 1
 * 样例输出
 * 8
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        if (N % 2 != 0) {
            System.out.println(-1);
            return;
        }
        int[][] arr = new int[N][3];
        for (int i = 0; i < arr.length; i++) {
            String str = scanner.nextLine();
            String[] s = str.split(" ");
            if (s.length != 1) {
                arr[i][0] = Integer.parseInt(s[0]);
                arr[i][1] = Integer.parseInt(s[1]);
                arr[i][2] = Integer.parseInt(s[2]);
            } else {
                arr[i][0] = Integer.parseInt(s[0]);
            }
        }
        int ans = fun(arr);
        System.out.println(ans);
        return;
    }
    public static int fun(int[][] arr) {
        int black = 0;
        int white = 0;
        int no = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 1) {
                white++;
            } else if (arr[i][0] == 2) {
                black++;
            } else {
                no++;
            }
        }
        int[][] t = new int[no][3];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                t[index++] = arr[i];
            }
        }
        Arrays.sort(t, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[2] - o2[2] : o2[1] - o1[2];
            }
        });
        int ans = 0;
        for (int i = 0; i < t.length; i++) {
            if (white == black) {
                if (t[i][1] < t[i][2]) {
                    ans += t[i][1];
                    white++;
                } else {
                    ans += t[i][2];
                    black++;
                }
            } else if (white < black) {
                ans += t[i][1];
                white++;
            } else {
                ans += t[i][2];
                black++;
            }
        }
        if (white != black) {
            return -1;
        } else {
            return ans;
        }

    }

}
