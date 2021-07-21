package sort;

/**
 * Created by JiaLe on 2021/7/21 21:56
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        countSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    //额外找个数组来计数，
    //然后在这个数组从小到大或从大到小把数取出来即可。
    public static void countSort(int[] arr) {
        int d = 0;
        int min = arr[0];
        int max = arr[0];

        //找出最大最小值
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]){
                max = arr[i];
            }
        }

        //建立一个用于计数的数组
        d = min;
        int[] count_map = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count_map[arr[i] - d]++;
        }

        int k = 0;
        for (int i = 0; i < arr.length; ) {
            if(count_map[k] > 0){
                arr[i] = k + d;
                i++;
                count_map[k]--;
            }else
                k++;
        }
    }

}
