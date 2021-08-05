package sort0805;

/**
 * Created by JiaLe on 2021/8/5 11:22
 */
public class heapsort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        heapSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    private static void heapSort(int[] arr) {
        for (int parent = arr.length / 2 + 1; parent >= 0; parent--) {
            adjustHeap(arr, parent, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, i, 0);
            adjustHeap(arr, 0, i);
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private static void adjustHeap(int[] arr, int parent, int length) {
        int val = arr[parent];
        for (int child = parent * 2 + 1; child < length; child = child * 2 + 1) {
            if (child + 1 < length && arr[child + 1] > arr[child]) {
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
