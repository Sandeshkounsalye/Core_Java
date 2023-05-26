package Multithreading.Pratice;

public class ExamleThread extends Thread{

    @Override
    public void run() {
        System.out.println("THREAD - 1");
        m1();
    }
     void m1(){
         System.out.println("Running M1......");
     }


    public static void main(String[] args) {
        ExamleThread e1=new ExamleThread();
        e1.start();
    }
}
