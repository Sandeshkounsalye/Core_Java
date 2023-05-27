package Multithreading.Pratice;

public class RunnableWay {
    public static void main(String[] args) {
        Work work=new Work();
        Thread thread=new Thread(work);
        thread.setName("Working Thread");
        thread.start();
    }
}
