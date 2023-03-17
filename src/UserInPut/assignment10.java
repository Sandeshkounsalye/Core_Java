package UserInPut;

import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks ");
        System.out.println("In Math :");
        int a=sc.nextInt();

        System.out.println("In English :");
        int b=sc.nextInt();

        System.out.println("In Science :");
        int c=sc.nextInt();

        int total=a+b+c;
        System.out.println("Total Marks :"+total);

        float d=total*100/300f;
        System.out.println("Percentage You Got :"+d);
        }





}
