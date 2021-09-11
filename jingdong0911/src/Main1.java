import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/11 19:50
 * 题目描述：
 * 你在玩一款游戏，在游戏中你不断地打倒敌人，并强化自己的战斗力。这个游戏中没有小怪，
 * 只有若干个 boss，你把所有 boss 全部打败即完成游戏。打 boss 的顺序可以自选。
 * 为了让你们计算起来更加轻松，我大大简化了每个 boss 的属性，每个 boss 只有两项属性：
 * 击败它需要的战斗力数值（大于等于该数值即可击败）、击败它之后，你可以永久获得的战斗力增加数值。
 * 在游戏的开始，你可以获得一定的战斗力，且这个战斗力与你花的钱成正比。
 * 你当然想尽可能地省钱，因此请你计算出能够通关的的前提下，一开始获得的最小战斗力。
 * 输入描述
 * 第一行整数 n，表示 boss 数量。1 <= n <= 100000
 * 后面 n 行，每行两个空格隔开的整数 x, y，表示击败这个 boss 需要的战斗力数值，击败它之后，
 * 你可以永久获得的战斗力增加数值。0 <= x, y <= 1000000000。
 * 输出描述
 * 一个整数，表示能通关的情况下，一开始获得的最小战斗力数值。
 * 样例输入
 * 3
 * 1000 100
 * 100 100
 * 200 700
 * 样例输出
 * 200
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] boss = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] temp = scanner.nextLine().split(" ");
            boss[i][0] = Integer.parseInt(temp[0]);
            boss[i][1] = Integer.parseInt(temp[1]);
        }
        Arrays.sort(boss, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
//        for (int[] num : boss) {
//            System.out.println(Arrays.toString(num));
//        }
        int ans = 0;
        int power = 0;
        for (int[] arr : boss) {
            if (arr[0] > power + ans) {
                ans += arr[0] - power - ans;
            }
            power += arr[1];
        }
        System.out.println(ans);
    }
}
