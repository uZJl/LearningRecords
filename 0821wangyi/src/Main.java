import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/21 15:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int M = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum < M) {
                list.add(new int[]{arr[l], arr[r]});
                while (l < r && arr[l] == arr[l + 1]) {
                    list.add(new int[]{arr[++l], arr[r]});
                }
                while (l < r && arr[r] == arr[r - 1]) {
                    list.add(new int[]{arr[--r], arr[r]});
                }
                r--;
            } else {
                r--;
            }
        }
        System.out.println(list.size());
    }
}
