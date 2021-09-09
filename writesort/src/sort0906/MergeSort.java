package sort0906;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/9/6 15:02
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,3,1,5,6,7,4,2,0};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr, int l, int r, int[] temp) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, m + 1, r, temp);
            merge(arr, l, m, r, temp);
        }
    }
    private static void merge(int[] arr, int l, int m, int r, int[] temp) {
        int i = l;
        int j = m + 1;
        int index = 0;
        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= m) {
            temp[index++] = arr[i++];
        }
        while (j <= r) {
            temp[index++] = arr[j++];
        }
        index = 0;
        while (l <= r) {
            arr[l++] = temp[index++];
        }
    }
}