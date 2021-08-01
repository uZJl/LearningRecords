package sort;

/**
 * Created by JiaLe on 2021/7/27 22:39
 */
public class HeapSort {
    public static void main(String[] args) {

    }

    private static void heapSort(int[] arr) {
        for (int parent = arr.length / 2 - 1; parent >= 0; parent--) {
            adjustHeap(arr, parent, arr.length);
        }
    }

    private static void adjustHeap(int[] arr, int parent, int len) {
        int val = arr[parent];
        for (int child = parent * 2 + 1; child < len; child = child * 2 + 1) {
            if (child + 1 < len && arr[child + 1] > arr[child]) {
                child++;
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
