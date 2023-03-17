package Multithreading;

public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread custom =new Thread(()->{
            for (int i = 1; i <=50 ; i++) {
                try {
                    Thread.sleep(100l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+i);
            }
        },"Vaibhav");
        custom.setPriority(10);

        Thread custom1 =new Thread(()->{
            for (int i = 51; i <=100 ; i++) {
                System.out.println(i);
            }
        });
        custom1.setPriority(1);
        custom.start();
        custom1.start();
        //custom.join();
        Thread.yield();


    }
}
