package sort;

/**
 * Created by JiaLe on 2021/8/1 21:14
 */
public class InsertSort {
    public static void main(String[] args) {

    }
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

}
