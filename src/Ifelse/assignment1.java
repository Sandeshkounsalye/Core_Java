package Ifelse;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length of Rectangle :");
        int a=sc.nextInt();

        System.out.println("Enter a Breadth of Rectangle :");
        int b=sc.nextInt();

        if(a==b){
            System.out.println("It is Square");
        }
        else{
            System.out.println("It is not a Square");
        }
    }
}
