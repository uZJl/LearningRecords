package sort0831;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/8/31 21:05
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9,8,3,1,5,6,7,4,2,0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void heapSort(int[] arr) {
        for (int parent = arr.length / 2 - 1; parent >= 0; parent--) {
            adjustSort(arr, parent, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, i, 0);
            adjustSort(arr, 0, i);
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private static void adjustSort(int[] arr, int parent, int len) {
        int val = arr[parent];
        for (int child = parent * 2 + 1; child < len; child = child * 2 + 1) {
            if (child + 1 < len && arr[child + 1] > arr[child]) {
                child = child + 1;
            }
            if (arr[child] > val) {
                arr[parent] = arr[child];
                parent = child;
            } else {
                break;
            }
        }
        arr[parent] = val;
    }
}
