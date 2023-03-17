package UserInPut;

import java.util.Scanner;

public class OldestYoungest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three age to find oldest and youngest among them :");
        int age1=sc.nextInt();
        int age2=sc.nextInt();
        int age3=sc.nextInt();

        if(age1>age2 && age1>age3){
            System.out.println("Oldest :"+age1);
        }
        else if(age2>age1 && age2>age3){
            System.out.println("Oldest :"+age2);
        }
        else {
            System.out.println("Oldest :"+age3);
        }
    }
}
