package Oop.Abstraction.Interface.Super;

public interface MassageService {
    void sendMassage();
    default void m1(){
        System.out.println("m1-");
    }
}
