package Array.SingleDim;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={23,44,29,88,67,50,16,3,99,102,145};
        // Sorting the array
        Arrays.sort(arr);
        //Printing the sorted Array
        System.out.println(Arrays.toString(arr));
        //Second-largest number
        System.out.println("Second Largest No : "+arr[arr.length-2]);


    }
}
