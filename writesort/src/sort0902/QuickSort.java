package sort0902;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/9/2 11:08
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,3,1,5,6,7,4,2,0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
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
