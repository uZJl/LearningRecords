package sort;

/**
 * Created by JiaLe on 2021/7/27 22:29
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l, j = r;
        while (i < j) {
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
            swap(arr, i, j);
        }
        swap(arr, i, l);
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }
    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
