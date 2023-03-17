package Array.SingleDim;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70,80,90,100};
        int sum=1;
         for (int i = 0; i < arr.length ; i++) {
            sum*=arr[i];
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length ; i++) {
          //  System.out.println(Arrays.toString(arr));

        }
    }
}
