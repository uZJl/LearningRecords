package sort;

/**
 * Created by JiaLe on 2021/7/24 11:22
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        heapSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    public static void heapSort(int[] arr) {
        //int i = arr.length / 2 - 1 第一个非叶子结点
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        for (int j = arr.length - 1; j > 0; j--) {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            adjustHeap(arr, 0, j);
        }
    }

    public static void adjustHeap(int[] arr, int parent, int len) {
        int val = arr[parent];
        for (int child = parent * 2 + 1; child < len; child = child * 2 + 1) {
            if (child + 1 < len && arr[child + 1] > arr[child]) {
                child++;//左节点小于右节点，child指向右节点
            }
            if (arr[child] > val) {// 子节点大于父节点 将子节点的值赋给父节点
                arr[parent] = arr[child];
                parent = child;
            } else {
                break;
            }
        }
        arr[parent] = val;//父子节点完成交换
    }
}
