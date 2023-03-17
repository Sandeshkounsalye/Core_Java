package Array.SingleDim;

import java.util.Scanner;

public class AddOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of an Array :");

        int a=sc.nextInt();
        int arr[]=new int[a];

        for (int i=0;i< arr.length;i++){
            System.out.print("Enter an Element :");
             arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
            System.out.println("Sum of Array is :"+sum);
    }
}
