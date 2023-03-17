package method;

import java.util.Scanner;

public class evenodd {
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();

    void m1(){
        if(a%2==0){
            System.out.println("Even no");
        }
        else {
            System.out.println("Odd no ");
        }

    }

    public static void main(String[] args) {
        System.out.print ("Enter a no :");

        evenodd evenodd=new evenodd();
        evenodd.m1();
    }
}
