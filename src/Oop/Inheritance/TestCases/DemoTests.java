package Oop.Inheritance.TestCases;

public class DemoTests {
    public static void main(String[] args) {
       // Parent class Reference Parent class object
        Demo2 d2=new Demo2();
        System.out.println(d2.a);
        d2.m1();

        System.out.println("---------------");

        //Child class Reference Child class object
        Demo3 d3 =new Demo3();
        System.out.println(d3.a);
        d3.m1();

        System.out.println("---------------");

        //Parent class Reference Child class object
        Demo2 d4=new Demo3();
        System.out.println(d4.a);
        d4.m1();//child

    }
}
