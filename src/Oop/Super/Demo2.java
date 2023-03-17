package Oop.Super;

public class Demo2 extends Demo1{
    int a=5;
    void m1(){
        System.out.println("hiii");
    }
    void m2(){
        System.out.println("heyeee");

        //Invoking the Method
        super.m1();
        System.out.println(super.a);
    }

}
