package Multithreading.Runnable;

public class Thread implements Runnable {
    private Runnable target;
    public Thread(Runnable target) {
        this.target = target;
    }
    public void run(){
        if (target!=null)
            target.run();
    }
    void start(){
        this.run();
    }
}
