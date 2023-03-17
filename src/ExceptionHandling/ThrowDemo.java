package ExceptionHandling;

public class ThrowDemo {
    public static void main(String[] args) {
       try {
           m1();
       }catch (ArithmeticException AE){
           System.out.println("Divide by zero");
       }
    }
    public static void m1() {
        System.out.println(10/0);
    }
}
