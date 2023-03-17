package ExceptionHandling;

public class demo1 {
    public static void main(String[] args) {

        try {
            String str=null;
           // System.out.println(str.length());
            System.out.println("Hello");
            System.out.println(10/0);
        }
        catch (ArithmeticException AE){
            System.out.println("Something Went wrong");;
        }
        catch (NullPointerException NE){
            System.out.println("String is Null");
        }finally {
            System.out.println("Finally Block");
        }
        System.out.println("rest of code");
    }
}
