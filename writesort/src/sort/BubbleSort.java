package sort;

/**
 * Created by JiaLe on 2021/7/27 22:25
 */
public class BubbleSort {
    public static void main(String[] args) {

    }
    public static void bubbleSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
