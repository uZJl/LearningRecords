import java.util.Scanner;

/**
 * Created by JiaLe on 2021/9/8 19:18
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 * 输入描述
 * 输入两个有序递增列表
 * 输出描述
 * 输出合并的有序递增列表
 * 样例输入
 * 1 6 12 18
 * 3 5 9 20
 * 样例输出
 * 1 3 5 6 9 12 18 20
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        int[] arr1 = new int[s1.length];
        int[] arr2 = new int[s2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(s2[i]);
        }
        int[] ans = fun(arr1, arr2);
        for (int i = 0; i < ans.length - 1; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(ans[ans.length - 1]);
    }
    private static int[] fun(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) return arr2;
        if (arr2 == null || arr2.length == 0) return arr1;
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[index++] = arr1[i++];
            } else {
                ans[index++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            ans[index++] = arr1[i++];
        }
        while (j < arr2.length) {
            ans[index++] = arr2[j++];
        }
        return ans;
    }

}
