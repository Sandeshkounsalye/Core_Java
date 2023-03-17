package Array.SingleDim;

import java.util.Arrays;

public class CheackEqual {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 5, 6, 7, 8};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};

        if (Arrays.equals(arr, arr1))
            System.out.println("Equal");
        else
            System.out.println("Not_Equal");

        int num = arr[3];
        System.out.println(num);
    }

}
