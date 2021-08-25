import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/25 19:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(1,str.length() - 1);
        String[] s = str1.split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] temp = fun(arr);
        System.out.println(Arrays.toString(temp));

    }
    public static int[] fun(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {
                map.put(temp[i], index++);
            }
            if (i > 0 && temp[i] != temp[i - 1]) {
                map.put(temp[i], index++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
