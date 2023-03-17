package Oop.Abstraction.Interface.FunctionalInterface;

public interface I {
    public int m2(int a,int b);

    public static void main(String[] args) {

        I i=(a,b)-> {return (a*b);};
        i.m2(10,10);

        Runnable r=()->{System.out.println("hi");};
        r.run();

    }
}
