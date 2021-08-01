package sort;

import java.util.ArrayList;

/**
 * Created by JiaLe on 2021/7/27 22:48
 */
public class MergeSort {
    public static void main(String[] args) {

    }
    private static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
    }
    private static void mergeSort(int[] arr, int l, int r, int[] temp) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m, temp);
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

        //将temp数组的值重新赋给arr数组
        index = 0;
        while (l <= r) {
            arr[l++] = temp[index++];
        }
    }

}
