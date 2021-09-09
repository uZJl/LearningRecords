import java.util.*;

/**
 * Created by JiaLe on 2021/9/9 20:17
 * 题目描述：
 * 小程现在协助管理一个大型仓库。其中有非常多的货物。
 * 现在来了很多运货车。每辆车只能装载一件货物，毫无疑问从经济的角度而言应该尽可能让这辆车满载。
 * 当然，也可能出现这辆车无法承载货物的可能。例如如果此时仓库最轻货物是重量100的，
 * 而这辆车的承载能力是50，那无论如何都无法使得这辆车运输货物。
 * 小程现在的打算是，每当一辆车过来，就尽量使得它满载。
 * （注：满载允许货物重量等于承载能力，即若承载能力是50，可以载重重量为50的货物）
 * 请注意：车是依次过来的，小程并不能事先预知所有的车的承载能力，只能尽量满足当前车。
 * 你的任务是求出小程每次为这些车所选择的货物重量。
 * 输入描述
 * 第一行两个正整数n,m，分别表示仓库中的货物数量和前来的运货车数量。
 * 第二行n组数据，表示n个货物的自身重量，以空格分隔。数据不保证有序。
 * 第三行m组数据，按顺序给出每次前来的运货车的承载能力。
 * 注意，数字间均有空格隔开。
 * 输出描述
 * 对于每个运货车，输出它所承载的货物重量；若这辆运货车无货可载，输出-1。每个输出之间以一个空格作为分隔。
 * 样例输入
 * 5 6
 * 5 10 5 11 10
 * 10 10 1 5 4 6
 * 样例输出
 * 10 10 -1 5 -1 5
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int[] arrN = new int[n];
        int[] arrM = new int[m];
        String[] strN = scanner.nextLine().split(" ");
        String[] strM = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(strN[i]);
        }
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(strM[i]);
        }
        Arrays.sort(arrN);
        List<Integer> list = new ArrayList<>();
        for (int i = arrN.length - 1; i >= 0; i--) {
            list.add(arrN[i]);
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        for (; i < arrM.length; i++) {
            int temp = arrM[i];
            int len = list.size();
            for (int j = 0; j < len; j++) {
                if (temp >= list.get(j)) {
                    ans.add(list.get(j));
                    list.remove(j);
                    break;
                }
                if (temp < list.get(j)) {
                    list.add(-1);
                }
            }
        }

        for (int j = 0; j < ans.size(); j++) {
            if (j != ans.size() - 1) {
                System.out.print(ans.get(j) + " ");
            } else {
                System.out.println(ans.get(j));
            }
        }
    }
}
