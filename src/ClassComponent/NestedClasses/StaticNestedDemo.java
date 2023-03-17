package ClassComponent.NestedClasses;

public class StaticNestedDemo {
    static class A{
        int a=10;
        void m1(){
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        //outer.inner ref=new outer.inner();
        StaticNestedDemo.A sb=new StaticNestedDemo.A();
        sb.m1();
        System.out.println(sb.a);
    }
}
