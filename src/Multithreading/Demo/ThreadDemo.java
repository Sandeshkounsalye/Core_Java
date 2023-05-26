package Multithreading.Demo;

public class ThreadDemo implements Runnable {


    public void start(){
        run();
    }
    public void run(){
        System.out.println("-------");
    }
    public static void main(String[] args) {
        Thread1 thread=new Thread1();
        thread.start();
    }
}
