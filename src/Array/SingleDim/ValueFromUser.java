package Array.SingleDim;

import java.util.Scanner;

public class ValueFromUser {
    public static void main(String[] args) {
        int arr[]=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 5 no ");
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter no :");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            System.out.println("Values are at index "+i+":"+arr[i]);
        }
        String arr1[]= {"Pune", "Mumbai", "Bangalore"};
        System.out.println(arr1.length);
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

}
