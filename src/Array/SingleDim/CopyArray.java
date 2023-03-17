package Array.SingleDim;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int []arr={10,50,80,5,7,3,46,12,78,12};
        int [] arr1=new int[10];

        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }

        System.out.println(Arrays.toString(arr1));
    }
}
