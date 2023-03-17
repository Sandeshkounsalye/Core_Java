package UserInPut;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length of Rectangle:");
        double a=sc.nextDouble();

        System.out.println("Enter a Breadth of Rectangle:");
        double b=sc.nextDouble();

        int area= (int) (a*b);
        System.out.println("Area of Rectangle :"+area);

    }
}
