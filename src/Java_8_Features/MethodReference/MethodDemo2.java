package Java_8_Features.MethodReference;

public class MethodDemo2 {
    public  static void ThreadStatus(){
        System.out.println("Thread is Running :-");
    }

    public static void main(String[] args) {
        Thread t1=new Thread(MethodDemo2::ThreadStatus);
        t1.start();
    }
}


