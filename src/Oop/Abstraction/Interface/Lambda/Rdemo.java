package Oop.Abstraction.Interface.Lambda;

public class Rdemo {
    public static void main(String[] args) {

        RunnableDemo rd=()-> System.out.println("Lambda");
        rd.m1();

//        Thread thread=new Thread(()-> System.out.println("lambda-_-_-_-_-_-_"));
//        thread.run();
//
//        Runnable runnable = ()->{
//            for (int i = 0; i <10 ; i++) {
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        runnable.run();
    }
}
