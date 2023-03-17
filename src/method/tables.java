package method;

import java.util.Scanner;

public class tables {
    void m1(int number){
        for(int i=1;i<=10;i++){
            int product = i * number;
            System.out.println(product);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to print table :");
        int number=sc.nextInt();
        tables tables=new tables();
        tables.m1(number);

    }
}
