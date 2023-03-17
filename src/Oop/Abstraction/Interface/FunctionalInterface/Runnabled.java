package Oop.Abstraction.Interface.FunctionalInterface;

public interface Runnabled {
    void run();
    public static void main(String[] args) {
        Runnabled rd= ()->{System.out.println("hello");};
        rd.run();
    }
}
