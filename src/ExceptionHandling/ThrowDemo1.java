package ExceptionHandling;

public class ThrowDemo1 {
    public static void main(String[] args) {
        System.out.println(10/0);
        throw new ArithmeticException("Divide zero");
        // automatically identifies the problematic situation
        // creates the ArrayIndexOutOfBoundsException class object
        // then it is thrown to JRE
        // JRE gives this object to the Default exception handler
        // Default exception handler prints the exception object details
        // Terminate the program.
    }
}
