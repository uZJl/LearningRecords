package sort;

/**
 * Created by JiaLe on 2021/7/27 22:39
 */
public class HeapSort {
    public static void main(String[] args) {

    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i++) {
            adjustSort(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
        }
    }

    public static void adjustSort(int[] arr, int parent, int len) {
        int val = arr[parent];
        for (int child = parent * 2 + 1; child < len; child = child * 2 + 1) {
            if (arr[child + 1] > arr[child]) {
                child++;
            }
            if (arr[child] > val) {
                arr[parent] = arr[child];
                arr[child] = val;
            } else {
                break;
            }
        }
        arr[parent] = val;
    }
}
