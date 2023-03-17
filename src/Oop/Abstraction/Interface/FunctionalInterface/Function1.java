package Oop.Abstraction.Interface.FunctionalInterface;

public class Function1  {
    public static void main(String[] args) {
    //Anonymous way
        function fn=new function() {
            @Override
            public void m1() {
                System.out.println("heyeee !!");

            }
        };
        fn.m1();

        //lambda Expression
        function f1=()-> System.out.println("hello By lambda  ");
        f1.m1();
    }

}
