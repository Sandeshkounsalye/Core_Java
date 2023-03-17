package Multithreading;

public class Worker {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i%2==0)
                    System.out.println("Even :"+i);
            }
        });
        Thread t1=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i%2!=0)
                    System.out.println(i);
            }
        });
        t.start();

        t1.start();

    }
}
