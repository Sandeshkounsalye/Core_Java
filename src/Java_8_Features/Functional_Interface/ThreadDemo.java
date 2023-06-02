package Java_8_Features.Functional_Interface;

import static java.lang.Thread.sleep;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable runnable= ()->{

            for (int i = 1; i <=10 ; i++) {
                System.out.println(i*5);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        };

        Thread t1=new Thread(runnable);
        t1.start();
    }


}
