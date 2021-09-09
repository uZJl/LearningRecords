import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/9 19:27
 * 题目描述：
 * 小程所在院系进行了期末考试。考试后小程发现老师登分产生了错误，遂寻找老师修改分数。
 * 老师将小程的分数做了修正。现在小程想知道他的成绩上升了多少名。
 * 注意：同分数的情况下，排名应该相同。比如说现在班里有五名同学，
 * Alice 100分，Bob 90分， Cindy 80分， David 80分，Emily 70分
 * 则他们的名次为
 * Alice 排名 1
 * Bob 排名2
 * Cindy 排名3
 * David 排名3
 * Emily 排名 5
 * 之后把Cindy 的分数修改为100分，则此时Alice和Cindy都是第一名。
 * 于是Cindy 的排名上升了 3 - 1 = 2名。
 * 你的任务就是协助小程计算他名次上升了多少。
 * 本题中保证小程修改分数后，不会出现名次下降的情况。
 * 输入描述
 * 第一行三个空格分隔开的正整数，分别表示学生数量n，小程原来的分数x，小程修改后的分数y。
 * 保证 y >= x
 * 接下来n个空格分隔开的正整数表示原先n个同学的分数。其中包括小程原来的分数，换句话说，
 * 这一行除了描述了小程成绩之外，还描述了另外n-1个同学的成绩。成绩的给出顺序不保证有序。
 * 输出描述
 * 输出小程修改后的名次上涨幅度。
 * 样例输入
 * 5 80 100
 * 100 90 80 80 70
 * 样例输出
 * 2
 *
 * 提示
 * 1<= n <= 100000，小程原来的分数x和修改后的分数y有1<= x, y <= 1000，且保证y >= x。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        int a = Integer.parseInt("100000");
        System.out.println(a);
        long n = Long.parseLong(arr1[0]);
        int m = Math.toIntExact(n);
        Long x = Long.parseLong(arr1[1]);
        Long y = Long.parseLong(arr1[2]);
        Long[] arr = new Long[m];
        String[] str = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        Arrays.sort(arr);
        HashMap<Long, Long> map = new HashMap<>();
        Long rank = 1l;
        map.put(arr[arr.length - 1], 1l);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                map.put(arr[i], ++rank);
            }
        }
//        for (Long num : arr) {
//            System.out.println(num + " " + map.get(num));
//        }
        Long before = map.get(x);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arr[i] = y;
                break;
            }
        }
        Arrays.sort(arr);
        HashMap<Long, Long> map1 = new HashMap<>();
        Long rank1 = 1l;
        map1.put(arr[arr.length - 1], 1l);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                map1.put(arr[i], ++rank1);
            }
        }
//        for (Long num : arr) {
//            System.out.println(num + " " + map.get(num));
//        }
        Long after = map1.get(y);
        Long ans = before - after;
        System.out.println(ans);
    }
}
