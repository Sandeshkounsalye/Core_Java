package Array.SingleDim;

public class MaxNumber {
    public static void main(String[] args) {
        int [] arr={10,50,80,5,7,3,46,12,781,12,10,111,189,55,};
        int max=arr[0];

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]>max){
                max=arr[index];
            }
        }
        System.out.println(max+" - is a max number");

    }
}
