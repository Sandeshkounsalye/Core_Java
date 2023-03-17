package Ifelse;

import java.util.Scanner;

public class marksystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Mark :");
        int mark=sc.nextInt();

        if(mark<35){
            System.out.println("Better Luck Next Time  ");
        }
        else if (mark>=35 && mark<40) {
            System.out.println("Ohh You Pass With D Grade !!! ");
        }
        else if (mark>=40&&mark<60) {
            System.out.println("Pass with C Grade ");
        }
        else if(mark>=60 && mark<80){
            System.out.println("Pass With B Grade ");

        }
        else if(mark>=80 && mark<100){
            System.out.println("Good keep it up !!! ");
        }
        else if (mark>100) {
            System.out.println("Invalid Input ");
        }

    }
}
