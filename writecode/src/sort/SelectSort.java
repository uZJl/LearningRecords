package sort;

/**
 * Created by JiaLe on 2021/7/24 11:16
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        selectSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int m = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }
            int temp = arr[m];
            arr[m] = arr[i];
            arr[i] = temp;
        }
    }
}
