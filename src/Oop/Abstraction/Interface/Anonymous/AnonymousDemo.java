package Oop.Abstraction.Interface.Anonymous;

public interface AnonymousDemo {
    void m1();

    public static void main(String[] args) {
        AnonymousDemo ad=new AnonymousDemo() {
            @Override
            public void m1() {
                System.out.println("Anonymous Demo");
            }
        };
        ad.m1();
    }

}
