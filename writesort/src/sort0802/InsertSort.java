package sort0802;

/**
 * Created by JiaLe on 2021/8/2 10:50
 */
public class InsertSort {
    public static void main(String[] args) {

    }
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
