package ControlStatementDemo;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check :");
        int b=sc.nextInt();

        switch (b){
            case 1:
                System.out.println("1st");
                break;
            case 2:
                System.out.println("2nd");
                break;
            case 3:
                System.out.println("3rd");
                break;
            case 4:
                System.out.println("4th");
                break;
            case 5:
                System.out.println("5th");
                break;
            default:
                System.out.println("...THE END...");
        }
    }
}
