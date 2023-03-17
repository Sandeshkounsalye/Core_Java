package NestedClasses;

public class InnerClass {
    int a=10;
    void b1(){
        System.out.println("hey !!! ");

    }
    class in{
        int b=20;
        static int f=189;
        void m5(){
            int c=40;
            System.out.println("hello");

        }
        static {

        }

    }

    public static void main(String[] args) {
        //accessing b1- outside of inner class
        InnerClass innerClass=new InnerClass();
        System.out.println(innerClass.a);
        innerClass.b1();

        //accessing m5-inside of inner class
        InnerClass.in inside=innerClass.new in();
        System.out.println(inside.b);
        System.out.println(inside.f);
        inside.m5();


    }
}
