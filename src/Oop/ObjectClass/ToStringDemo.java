package Oop.ObjectClass;

public class ToStringDemo {
    public static void main(String[] args) {

    Student student=new Student();
    int hashCode1=student.hashCode();
        System.out.println("Decimal HashCode"+hashCode1);
       System.out.println("HexaDecimal "+Integer.toHexString(hashCode1));
        System.out.println("-----------");

        System.out.println(Integer.toHexString(student.hashCode()));
        System.out.println(student.toString());

    }
}
