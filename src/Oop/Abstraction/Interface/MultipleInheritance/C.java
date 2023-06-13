package Oop.Abstraction.Interface.MultipleInheritance;

public class C implements A,B{


    @Override
    public void m1() {
        System.out.println("Multiple Inheritance");
    }

    @Override
    public void m3() {

    }

    @Override
    public void m2() {
        System.out.println("Another Method in Class A");
    }

    public static void main(String[] args) {
        C c=new C();
        c.m1();
        c.m2();
        c.m5();
    }
}
