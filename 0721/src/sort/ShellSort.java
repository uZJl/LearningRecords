package sort;

/**
 * Created by JiaLe on 2021/7/21 21:46
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        shellSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    public static void shellSort(int[] arr) {
        for (int d = arr.length / 2; d > 0; d /= 2) {
            for (int i = d; i < arr.length; i++) {
                int temp = arr[i];
                int j = 0;
                for (j = i - d; j >= 0 && temp < arr[j]; j -= d) {
                    arr[j + d] = arr[j];
                }
                arr[j + d] = temp;
            }
        }
    }
}
