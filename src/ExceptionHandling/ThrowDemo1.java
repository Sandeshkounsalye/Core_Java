package ExceptionHandling;

public class ThrowDemo1 {
    public static void main(String[] args) {
        System.out.println(10/0);
        throw new ArithmeticException("Divide zero");
    }
}
