package Ifelse;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Price of product :");
        int a=1;
        int sum=0;

        for(int i=0;i<a;i++){
            System.out.print("Price --> ");
             a=sc.nextInt();
             sum=sum+a;


        }
        System.out.println(sum);
    }
}
