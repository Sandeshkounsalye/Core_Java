package Array.SingleDim;

public class ContainValue {
    public static void main(String[] args) {
        int []arr={10,55,94,65,23,42,7,25,31};
        int num=10;
        boolean contain=false;

        for (int i=0;i< arr.length;i++){
            if (num==arr[i]){
                contain=true;
                break;
            }
        }


        if(contain)
            System.out.println("Contain in Array");
        else
            System.out.println("Not_Contain in Array");
    }
}
