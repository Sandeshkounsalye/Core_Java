package method;

import java.util.Scanner;

public class sum {
    int a;
    int b;



    void m1(int num1,int num2){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=num1;
        b=num2;

    }
    void   addition(){
        System.out.println( );
    }
    public static void main(String[] args) {
        System.out.println("Enter a two no :");
        sum sum=new sum();
        sum.m1(sum.a, sum.b);
        sum.addition();
    }
}
