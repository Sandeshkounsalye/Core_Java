package Array.SingleDim;

public class ContainValue {
    public static void main(String[] args) {
        int []arr={10,55,94,65,23,42,7,25,31};
        int num=100;
        boolean contain=false;

        for (int i=0;i< arr.length;i++){
            if (num==arr[i]){
                contain=true;
                break;
            }
        }
        System.out.println(contain?"contain in Array": "Not Contain in array");

//        if(contain)
//            System.out.println("Contain in Array");
//        else
//            System.out.println("Not Contain in Array");

    }
}
