package sort0830;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/8/30 20:40
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9,8,3,1,5,6,7,4,2,8,0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, i, 0);
            adjustHeap(arr, 0, i);
        }

    }
    private static void adjustHeap(int[] arr, int parent, int length) {
        int val = arr[parent];
        for (int child = parent * 2 + 1; child < length; child = child * 2 + 1) {
            if (child + 1 < length && arr[child + 1] > arr[child]) {
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
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
