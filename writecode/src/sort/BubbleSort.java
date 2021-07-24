package sort;

/**
 * Created by JiaLe on 2021/7/24 10:46
 */
public class BubbleSort {
    public static void main(String[] args) {

    }
    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
