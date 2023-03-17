package Array.SingleDim;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr={23,44,29,-19,88,67,50,16,3,99,102,145};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("Second Smallest No : "+arr[1]);
    }
}
