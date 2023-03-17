package Array.SingleDim;

public class CheackNumber {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        boolean present=false;
        int num=19;

        for (int index = 0; index < arr.length; index++) {
            if (num==arr[index] )
                present =true;
        }

        if (present)
            System.out.println("Present in array");
        else
            System.out.println("Not Present in array");

    }
}
