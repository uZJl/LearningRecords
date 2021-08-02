package sort0802;

/**
 * Created by JiaLe on 2021/8/2 10:33
 */
public class QuickSort {
    public static void main(String[] args) {

    }
    private static void quickSort(int[] arr) {

    }
    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && arr[j] >= arr[l]) {
                j--;
            }
            while (i < j && arr[i] <= arr[l]) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, i, l);
        quickSort(arr, i, l - 1);
        quickSort(arr, l + 1, r);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
