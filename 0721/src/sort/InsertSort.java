package sort;

/**
 * Created by JiaLe on 2021/7/21 21:15
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        insertSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            //要插入的数的落点（极端情况下上面循环到j=0停止，
            // 跳出循环时就j=-1，此时arr[j+1]=temp才成立）
            arr[j + 1] = temp;
        }
    }
}
