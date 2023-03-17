package Oop.Abstraction.Interface.DefaultMethod;

public interface DefaultDemo {
   public void m1();

   default void m2(){
      System.out.println("Default from m2------>1");
   }
}
