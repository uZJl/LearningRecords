package sort;

/**
 * Created by JiaLe on 2021/7/21 20:56
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        mergeSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left; // 左序列起始下标
        int j = mid + 1;// 右序列起始下标
        int t = 0; // 临时数组指针
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
        }

        t = 0;

        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
