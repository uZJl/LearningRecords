package sort0802;

/**
 * Created by JiaLe on 2021/8/2 11:14
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        selectSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int m = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }
            swap(arr, m, i);
        }
    }

    private static void swap(int[] arr, int m, int i) {
        int temp = arr[i];
        arr[i] = arr[m];
        arr[m] = temp;
    }
}
