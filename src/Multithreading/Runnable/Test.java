package Multithreading.Runnable;

public class Test {
    public static void main(String[] args) {
        // Runnable runnable = () -> {System.out.println("Lambda");};
        // Thread t = new Thread(runnable);
        Thread t = new Thread(() -> {System.out.println("Lambda ");});
        t.start();
    }
}