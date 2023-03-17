package NestedClasses;

public class StaticNestedClass {
    static class A{
        int a=10;
        static int roll=50;
        void m1(){
            System.out.println("bye ");
        }
        static void m2(){
            System.out.println("-------****------");
        }
    }

    public static void main(String[] args) {

         // accessing static members
        System.out.println(A.roll);
        A.m2();

         // accessing nonstatic a and m1
        StaticNestedClass.A sc=new StaticNestedClass.A();
        System.out.println(sc.a);
        sc.m1();

    }
}
