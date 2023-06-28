package Oop.Abstraction.Abstract;

import java.util.Scanner;

public   class classDemo1 {
// 1. If number is odd, print Weird
//2. If number is even and in the inclusive range of 2 to 5, print Not Weird
//3. If is even and in the inclusive range of to 6 to 20, print Weird
//4. If is even and greater than 20, print Not Weird

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number= sc.nextInt();

        switch (number){
            case 1:
                if (number%2!=0){
                    System.out.println("weird");
                }
                break;
            case 2:
                if (number%2==0){
                    System.out.println("Not weired");
                }
            case 3:

        }
    }
}

