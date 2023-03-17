package ClassComponent.NestedClasses;

public class LocalInnerDemo {
    void m1() {
        class A {
            int x = 10;
            void m4() {
                System.out.println("Local Inner Class.....!!!!");
            }
        }
        A a = new A();
        System.out.println(a.x);
        a.m4();
    }
    public static void main(String[] args) {
      LocalInnerDemo ld=new LocalInnerDemo();
      ld.m1();

    }
}