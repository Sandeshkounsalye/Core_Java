package ExceptionHandling;

public class ThrowsTest {
    public static void main(String[] args) {
        ThrowsTest tr=new ThrowsTest();
        tr.divide();
    }
    void divide(){
        int a=100;
        int b=0;
        int c =a/b;
        System.out.println(c);
    }
}
