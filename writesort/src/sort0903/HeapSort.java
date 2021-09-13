package sort0903;

/**
 * Created by JiaLe on 2021/9/3 16:39
 * 是对直接选择排序的改进，不稳定，时间复杂度 O(nlogn)，空间复杂度 O(1)。
 * 将待排序记录看作完全二叉树，可以建立大根堆或小根堆，大根堆中每个节点的值都不小于它的子节点
 * 值，小根堆中每个节点的值都不大于它的子节点值。
 * 以大根堆为例，在建堆时首先将最后一个节点作为当前节点，如果当前节点存在父节点且值大于父节
 * 点，就将当前节点和父节点交换。在移除时首先暂存根节点的值，然后用最后一个节点代替根节点并作
 * 为当前节点，如果当前节点存在子节点且值小于子节点，就将其与值较大的子节点进行交换，调整完堆
 * 后返回暂存的值。
 */
public class HeapSort {
    public static void main(String[] args) {

    }
    private static void heapSort(int[] arr) {
//        for (int parent = arr.length / 2 - 1; )
    }
}
