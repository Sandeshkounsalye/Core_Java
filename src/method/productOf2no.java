package method;

import java.util.Scanner;

public class productOf2no {
    int number1;
    int number2;


    void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two no :");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();


    }

    void m3(int a, int b) {
        number1 = a;
        number2 = b;

    }
     void  m4(){
        //......
    }

    int m2() {
        return number1 * number2;
    }

    public static void main(String[] args) {
        productOf2no productOf2no = new productOf2no();
        productOf2no.m3(productOf2no.number1, productOf2no.number2);

        productOf2no.m1();
        System.out.println(productOf2no.m2());

        System.out.println(productOf2no.m2());
        productOf2no.m4();


    }

}
