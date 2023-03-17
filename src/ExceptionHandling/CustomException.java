package ExceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age=sc.nextInt();
        if(age < 18) {
            throw new InvalidAgeException("You are under age");
        }
        else {
            System.out.println("You are eligible for voting");
        }

    }
}
