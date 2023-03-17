package Oop.Abstraction.Interface.DefaultMethod;

public interface DefaultTest1  {
    public void m1();
    default void m2(){
        System.out.println("Default from m2");
    }


}
