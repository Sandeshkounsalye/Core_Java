package Multithreading.Demo;

public class MyThread extends Thread {
   public void run(){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

}
class ThredDemo1{
    public static void main(String[] args) {
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        th1.start();
        th2.start();

    }
}