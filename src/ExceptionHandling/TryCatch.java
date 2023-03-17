package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            int []arr=new int [4];
            System.out.println(arr[5]);
        }
        catch (ArithmeticException NE){
            System.out.println("DIVIDE BY ZERO");
        }catch (ArrayIndexOutOfBoundsException ABE){
            System.out.println("Wrong Array access");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
