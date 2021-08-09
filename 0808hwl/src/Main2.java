import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/8 15:02
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        int len = num.length;
        int min = 0;
        int max = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr1 = new int[100001];

        for (int i = 0; i < len; i++) {
            int temp = map.getOrDefault(num[i], 0);
            map.put(num[i], temp);
            arr1[temp + 1]++;
            arr1[temp]--;
            if (max == min) {
                res = i + 1;
            }
            if (arr1[min] <= 0) {
                min++;
            } else {
                min = 1;
            }
            max = Math.max(max, temp + 1);
            if ((arr1[min] + 1) * min == i || max * arr1[max] == i) {
                res = i + 1;
            }
        }
        System.out.println(res);
    }
}
