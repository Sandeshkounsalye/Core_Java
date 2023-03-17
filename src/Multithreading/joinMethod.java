package Multithreading;

public class joinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            for (int i = 1; i <=100 ; i++) {
                try {
                    Thread.sleep(100l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        });
        Thread t1=new Thread(()->{
            for (int i = 101; i <=200 ; i++) {
                System.out.println(i);
            }
        });
        t1.join(100000l);
        t1.start();
        t.start();

    }
}
