package Oop.Polymorphism;

public class MethodOverloadingDemo {
    int a=10;
    String name="ram";

   private void m1(int a,int b){
        System.out.println("hello");
        System.out.println(a+b);
    }
    float m1(float a,float b){
        return (a+b);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();
        md.m1(10,20);
        System.out.println(md.m1(12.5f,12.2f));
    }

}
