import java.util.*;

/**
 * Created by JiaLe on 2021/9/15 19:19
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String[] nums = scanner.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                list.add(arr[i]);
            }
        }
        if (k > list.size()) {
            System.out.println(-1);
        }
        for (int i = 0; i <= k - 1; i++) {
            if (i == k - 1) {
                System.out.println(list.get(i));
            }
        }

    }
}
