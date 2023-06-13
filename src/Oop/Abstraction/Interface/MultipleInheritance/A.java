package Oop.Abstraction.Interface.MultipleInheritance;

public interface A {
    public void m1();

    public  void m2();

    default void m5(){
        System.out.println("Default Method from the Class A");
    }
}
