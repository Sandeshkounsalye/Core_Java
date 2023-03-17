package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("abc.txt");
        System.out.println(pw);

    }
}
