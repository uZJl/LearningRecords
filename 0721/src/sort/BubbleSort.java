package sort;

/**
 * Created by JiaLe on 2021/7/21 19:02
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean flag = true;
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

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
