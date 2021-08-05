package sort0805;

/**
 * Created by JiaLe on 2021/8/5 11:01
 */
public class insertsort {
    public static void main(String[] args) {

    }
    private static void insertSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && temp < arr[j]; i--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
