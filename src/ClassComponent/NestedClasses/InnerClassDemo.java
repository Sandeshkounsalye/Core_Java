package ClassComponent.NestedClasses;

import java.util.Scanner;

public class InnerClassDemo {

    class A{
        int a;

        void m1(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a NO :");
            int a=sc.nextInt();
            System.out.println(a);
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        //Outer class
        InnerClassDemo innerClassDemo=new InnerClassDemo();
        // Inner class
        // outer.inner ref=outer ref.new inner();
         InnerClassDemo.A ia=innerClassDemo.new A();
         ia.m1();//ia - ref
        System.out.println(ia.a);

    }

}
