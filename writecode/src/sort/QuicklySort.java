package sort;

/**
 * Created by JiaLe on 2021/7/24 10:50
 * 快速排序就是每次找一个基点（第一个元素），
 * 然后两个哨兵，一个从最前面往后走，
 * 一个从最后面往前面走，
 * 如果后面那个哨兵找到了一个比基点小的数停下来，
 * 前面那个哨兵找到比基点大的数停下来，
 * 然后交换两个哨兵找到的数，
 * 如果找不到最后两个哨兵就会碰到一起就结束，
 * 最后交换基点和哨兵相遇的地方的元素，
 * 然后就将一个序列分为比基点小的一部分和比基点大的一部分，
 * 然后递归左半部分和右半部分，最后的结果就是有序的了。
 *
 */
public class QuicklySort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int base = arr[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            while (arr[j] >= base && j > i) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[begin] = arr[i];
        arr[i] = base;
        quickSort(arr, begin, i - 1);
        quickSort(arr, i + 1, end);
    }
}
