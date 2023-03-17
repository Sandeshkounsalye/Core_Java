package Oop.Abstraction.Interface.DefaultMethod;

public class DefaultTest implements DefaultDemo,DefaultTest1{


//    @Override
//    public void m1() {
//        System.out.println("");
//
//    }
//
//
//    public static void main(String[] args) {
//
//        //Anonymous Way
//        DefaultDemo dd=new DefaultDemo() {
//            @Override
//            public void m1() {
//                System.out.println("Anonymous Class");
//            }
//        };
//        dd.m1();
//
//    }
    //------------------------------------------------------------
       @Override
           public void m1() {
           System.out.println("*****  From m1 method ");

       }

    @Override
    public void m2() {
        DefaultDemo.super.m2();
        DefaultTest1.super.m2();
    }

    public static void main(String[] args) {
        DefaultTest dt= new DefaultTest();
        dt.m1();
        dt.m2();

        System.out.println("---------------");

        DefaultDemo d1=new DefaultDemo() {
            @Override
            public void m1() {
                System.out.println("Anonymous Way");
            }
        };
        d1.m1();
        d1.m2();

    }



}
