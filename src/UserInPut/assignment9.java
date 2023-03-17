package UserInPut;

import java.util.Scanner;

public class assignment9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no1 :");
        int a= sc.nextInt();

        System.out.println("Enter a no2 :");
        int b=sc.nextInt();

        if(a<b && a<50){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
