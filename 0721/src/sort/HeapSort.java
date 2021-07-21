package sort;

/**
 * Created by JiaLe on 2021/7/21 19:40
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
        //构建大顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int j = arr.length - 1; j > 0; j--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            adjustHeap(arr, 0, j);
        }
    }
    /* 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上, 也就是说只调用一次,并没有得到大顶堆）
     * 就是将arr[parent] 的值放到本次调整过程中适当的位置。
    */
    private static void adjustHeap(int[] arr, int parent, int len) {
        int val = arr[parent];
        for (int child = 2 * parent + 1; child < len; child = child * 2 + 1) {
            if (child + 1 < len && arr[child] < arr[child + 1]) {
                child++;// 如果左节点小于右节点，child指向右节点
            }
            if (arr[child] > val) {// 子节点大于父节点，将子节点的值赋给父节点
                arr[parent] = arr[child];
                parent = child;//parent 指向 child，继续循环比较
            } else {
                break;
            }
        }
        arr[parent] = val;
    }
}
