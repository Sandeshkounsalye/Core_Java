package operators;

import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Temperature in Fahrenheit ");
        int a=sc.nextInt();

       float celsius = (a - 32)*5/9f;
        System.out.println("Temp in Celsius :"+celsius);

    }
}
