package Array.SingleDim;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Declare Array and Specify Size
        int arr[]=new int[5];

        // For is used to display array Value
        for (int i=0;i<arr.length;i++){
            System.out.println("Value "+(i+1)+":"+arr[i]);
        }
        // [arr.length]- Get the array size
        System.out.println("Length Of Array is :"+arr.length);
        System.out.println(Arrays.toString(arr));

        int[] array = {1, 2, 3, 4, 5};
        for (int index = array.length-1; index >=0 ; index--) {
            System.out.print(array[index]);
        }

       // System.out.println(Arrays.toString(array));


    }
}
