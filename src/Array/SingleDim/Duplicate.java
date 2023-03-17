package Array.SingleDim;

public class Duplicate {
    public static void main(String[] args) {
        int [] arr={10,50,80,5,7,3,46,78,660,10,111,80,55,};
        boolean found=false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    found=true;
                    System.out.print(arr[j]+" ");
                    break;

            }
            if(found=true)
                break;

        }
        System.out.println((found)?"Fount":"Not Found");

    }
}
