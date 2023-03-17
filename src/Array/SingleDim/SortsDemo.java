package Array.SingleDim;

import java.util.Arrays;

public class SortsDemo {
    public static void main(String[] args) {
        int arr[]={5,6,1,2,9,4,5,19,20,2};
        int size= arr.length;
        Arrays.sort(arr);
        //System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
       // System.out.println(arr[arr.length-2]);
        System.out.println(arr[1]);


        char [] arr1={'c','b','e','g','f','a','d'};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }

    }
}
