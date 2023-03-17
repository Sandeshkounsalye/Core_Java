package Oop.Abstraction.Interface.Super;

public interface MassageService2 {
    void sendMassage();
    default void m1(){
        System.out.println("m2--");
    }

}
