package Oop.Polymorphism;

public class StudentTest extends StudentDemo{
    @Override
    void m1() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        StudentDemo sd=new StudentDemo();
        sd.m1();

        StudentTest st =new StudentTest();
        st.m1();  //child


    }
}
