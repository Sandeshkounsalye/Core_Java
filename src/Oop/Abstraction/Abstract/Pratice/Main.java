package Oop.Abstraction.Abstract.Pratice;

public class Main {
    public static void main(String[] args) {
//        Abstract_Class abstract_class=new Abstract_Class()
//        {
//            @Override
//            public void m4() {
//                System.out.println("Anon");
//            }
//        };
//        abstract_class.m4();
//        abstract_class.m5();

        //Can't create object of abstract classs
       // ConcreteClass concreteClass=new Abstract_Class();

        //abstract ref can create
        Abstract_Class abstract_class1=new ConcreteClass();
        abstract_class1.m4();
        abstract_class1.m5();
    }
}
