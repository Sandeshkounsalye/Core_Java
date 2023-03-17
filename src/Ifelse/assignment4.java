package Ifelse;

import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary :");
        int salary = sc.nextInt();

        System.out.println("Enter year of service :");
        int service = sc.nextInt();

        float bonus =0;
        if (service > 5) {
            bonus = salary*0.5f;
        }
        System.out.println("Bonus amount is :" + bonus);
    }
}
