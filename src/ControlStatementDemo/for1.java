package ControlStatementDemo;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();

        for (int i=1;i<=a;i++){
            System.out.println("hello"+i);
        }
    }
}
