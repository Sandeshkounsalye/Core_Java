package Array.Pratice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr={5,3,6,7,9,4,1,2,8,5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    int temp=0;
                    if (arr[i] > arr[j]){
                       temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                }

            }
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
