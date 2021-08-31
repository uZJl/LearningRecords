package sort0830;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/8/31 19:36
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9,8,3,1,5,6,7,4,2,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && temp < arr[j]; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
