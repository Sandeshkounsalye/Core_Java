package Array.SingleDim;

public class SortingArray {
    public static void main(String[] args) {
        int [] arr={9,1,5,6,7,2,3,8,10,4};


        for (int i = 0; i < args.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=0;
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        System.out.println(arr[i]);
        }
    }
}
