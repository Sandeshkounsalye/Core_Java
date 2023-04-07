package Array.SingleDim;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int [] newarr=new int[arr.length+1];

        int n= arr.length;
        int element=5;

        for (int i = 0; i < arr.length ; i++) {
            newarr[i+1]=arr[i];
        }
        newarr[n]=element;
        System.out.println(Arrays.toString(newarr));
        for (int a:arr){
            System.out.println(a);
        }
    }
}
