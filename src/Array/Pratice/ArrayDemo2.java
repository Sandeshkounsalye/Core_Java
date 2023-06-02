package Array.Pratice;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50,60};

        int[] arr1=arr;

        for (int i = 0; i <=arr1.length-1 ; i++) {
            //System.out.print(Arrays.toString(arr));
            System.out.print(arr[i]+" ");
        }
    }
}
