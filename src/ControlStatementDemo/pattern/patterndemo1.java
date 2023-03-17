package ControlStatementDemo.pattern;

import java.util.Scanner;

public class patterndemo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no :");
        int a=sc.nextInt();
        int sum =0;

        for(int i=1 ;i<=a;i++){
//            System.out.println("table of "+a);
//            System.out.println(i*a);

           // System.out.println("sum of ");
            sum+=i;
        }
        System.out.println("sum"+sum);

    }

}
