package Array.SingleDim;

public class MinNumber {
    public static void main(String[] args) {
        int [] arr={10,50,80,5,7,3,46,12,-1,78,12,10,111,189,55,};
        int min=arr[0];

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]<min){
                min=arr[index];
            }
        }
        System.out.println(min+" - is minimum number");
    }
}
