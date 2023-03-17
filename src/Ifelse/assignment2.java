package Ifelse;

import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two no ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a+" is greatest no");
        }
        else{
            System.out.println(b+" is  greatest no");
        }
    }
}
