package NestedClasses;

public class OuterA {
    public static int a=10;

    static class Nested{

        public  void m1(){
            System.out.println("a : " +a);
        }
    }

    public static void main(String[] args) {
        OuterA.Nested obj=new OuterA.Nested(); //Object created nested class
        //here we are not creating an obj of outer class
        obj.m1();

    }
}
