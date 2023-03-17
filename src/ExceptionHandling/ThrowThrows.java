package ExceptionHandling;

public class ThrowThrows {
    public static void m1() throws ArithmeticException{
        System.out.println(10/0);

    }

    public static void main(String[] args) {
        try {
        m1();
        }catch (ArithmeticException E){
            System.out.println("A...................");
        }
}
}
