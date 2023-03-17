package Array.SingleDim;

public class OddNo {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        System.out.print("Odd no are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0)
                System.out.print(arr[i]+" ");

        }
    }
}
