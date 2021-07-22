package sort;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/7/21 22:46
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,89,6,7,1,3};
        radixSort(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }
    public static void radixSort(int[] arr) {
        // TODO: 2021/7/21
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }

        //最大数的长度
        int maxLen = (max+"").length();

        //定义一个二维数组，表示10个桶，每个桶就是一个数组
        //为了在放入数的时候数据溢出，每个桶大小定义为arr.length
        int[][] bucket = new int[10][arr.length];

        //定义一个一维数组来记录各个桶每次放入数据的个数
        int[] bucketElementCount = new int[10];

        for (int i = 0, n = 1; i < maxLen; i++, n *= 10) {
            //对每个元素对应位进行处理
            for (int j = 0; j < arr.length; j++) {
                int digiOfElement = arr[j] / n % 10;
                bucket[digiOfElement][bucketElementCount[digiOfElement]] = arr[j];
                bucketElementCount[digiOfElement]++;
            }
            //按照这个桶的顺序即一维数组的下标一次取出数据放入原来数组
            int index = 0;

            for (int k = 0; k < bucketElementCount.length; k++) {
                if (bucketElementCount[k] != 0) {
                    for (int m = 0; m < bucketElementCount[k]; m++) {
                        arr[index++] = bucket[k][m];
                    }
                }
                bucketElementCount[k] = 0;
            }

            System.out.println("第"+(i+1)+"轮，排序处理 arr="+ Arrays.toString(arr));
        }

    }
}
