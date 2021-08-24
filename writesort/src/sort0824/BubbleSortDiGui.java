package sort0824;

import java.util.Arrays;

/**
 * Created by JiaLe on 2021/8/24 9:55
 */
public class BubbleSortDiGui {

    private static void bubbleSortWithoutLoop(int[] a, int pos, int endPos, boolean noChange){
        // compare & bobble
        if(a[pos]>a[pos+1]){
            int temp = a[pos];
            a[pos] = a[pos+1];
            a[pos+1] = temp;
            noChange = false;
        }
        // is the end of this round?
        if(pos<endPos){
            // continue this round
            bubbleSortWithoutLoop(a,pos+1,endPos,noChange);
        } else {
            // if there has next round and need to go next round
            if(endPos>0 && !noChange){
                // next round
                bubbleSortWithoutLoop(a,0,endPos-1,true);
            }
            // otherwise end the sort
        }
    }

    public static void main(String[] args){
        int[] a = {4,10,8,2,1,11,9,5,6,3,7};
        bubbleSortWithoutLoop(a,0,a.length-2,true);
        System.out.println(Arrays.toString(a));

    }
}

