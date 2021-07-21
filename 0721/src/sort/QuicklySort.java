package sort;

/**
 * Created by JiaLe on 2021/7/21 19:20
 */
public class QuicklySort {
    public static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length - 1);
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int base = arr[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            while (arr[j] >= base && i < j) {
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
        // 将基准为i和j相等的位置的数字交换
        arr[begin] = arr[i];
        arr[i] = base;
        quickSort(arr, begin, i - 1);//递归调用左半数组
        quickSort(arr, i + 1, end);// 递归调用右半数组
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        quickSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
