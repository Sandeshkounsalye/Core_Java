import java.util.Scanner;

public class DuplicateRemove {

    public static void main(String[] args) {

        System.out.println("Enter a Size of array :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];

        //Getting the array from user
        for (int i = 0; i < n ; i++) {
            array[i]=sc.nextInt();
        }

        //Finding the duplicate values from the array
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]==array[j]){
                    System.out.println(array[i]+" Duplicate Values");
                }
            }
        }



























    }
}
