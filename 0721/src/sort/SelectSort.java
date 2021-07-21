package sort;

/**
 * Created by JiaLe on 2021/7/21 19:34
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
            int m = i;//最小值的下标
            for (int j = i + 1; j < arr.length; j++) {
                //找到比arr[m]小的数
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }
            //交换
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }
    }
}
