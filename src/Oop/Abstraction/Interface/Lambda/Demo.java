package Oop.Abstraction.Interface.Lambda;

public interface Demo {
    void m1();

    public static void main(String[] args) {
        //Anonymous way
        Demo d=new Demo() {
            @Override
            public void m1() {
                System.out.println("1.Anonymous Way");
            }
        };
        d.m1();

        Demo d1=()-> System.out.println("2.Lambda Way");
        d1.m1();
    }
}
