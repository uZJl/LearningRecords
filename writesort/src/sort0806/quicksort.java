package sort0806;

/**
 * Created by JiaLe on 2021/8/6 8:12
 */
public class quicksort {
    public static void main(String[] args) {

    }
    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && arr[l] <= arr[j]) j--;
            while (i < j && arr[l] >= arr[i]) i++;
            swap(arr, i, j);
        }
        swap(arr, i, l);
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
