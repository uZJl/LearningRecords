import java.util.*;

/**
 * Created by JiaLe on 2021/9/15 19:33
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] num = scanner.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(arr);
        int len = arr.length;
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                list.add(arr[i]);
            }
        }
        int[] arr1 = new int[list.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {

            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = arr1[i] + arr1[l] + arr1[r];
                if (sum % m == 0) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(arr1[i]);
                    list1.add(arr1[l]);
                    list1.add(arr1[r]);
                    res.add(new ArrayList<>(list1));
                    l++;
                    r--;
                } else if ((l + 1) < r && (arr1[i] + arr1[l + 1] + arr1[r]) % sum == 0) {
                    l++;
                } else if (l < (r - 1) && (arr1[i] + arr1[l] + arr1[r - 1]) % sum == 0) {
                    r--;
                } else {
                    l++;
                    r--;
                }
            }
        }
        int ans = res.size();
        System.out.println(ans);
    }
}
