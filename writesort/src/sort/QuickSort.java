package sort;

/**
 * Created by JiaLe on 2021/7/27 22:29
 */
public class QuickSort {
    public static void main(String[] args) {

    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int base = arr[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            //从左往右找比base大的，
            //从右往左找比base小的
            while (i < j && arr[i] <= base) {
                i++;
            }
            while (i < j && arr[j] >= base) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //
        arr[begin] = arr[i];
        arr[i] = base;
        quickSort(arr, begin, i - 1);
        quickSort(arr, i + 1, end);
    }
}
