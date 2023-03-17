package ExceptionHandling;

public class PrintStackStrace {
    public static void main(String[] args) {
        try {
            String str =null;
            System.out.println(str.length());
            System.out.println(10/0);
        }
        catch (NullPointerException NE){
            System.out.println("Null string");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
