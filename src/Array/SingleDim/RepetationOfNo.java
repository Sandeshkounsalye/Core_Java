package Array.SingleDim;

public class RepetationOfNo {
    public static void main(String[] args) {
        int [] arr={10,20,30,50,60,10,80,10,60,50,10,20,30,90,50,60,50,60,50,60,50};
        int count =0;
        int count1=0;

        int num=50;
        int num1=30;


        for (int i = 0; i <= arr.length-1 ; i++) {
            if (arr[i]==num) {
                count++;
            }
            if(arr[i]==num1)
                count1++;

        }
        System.out.println(count);
        System.out.println(count1);
    }

}

