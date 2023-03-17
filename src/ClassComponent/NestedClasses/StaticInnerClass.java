package ClassComponent.NestedClasses;

public class StaticInnerClass {
    static class B{
        int x=20;
        void m2(){
            System.out.println("Static Inner Class");
        }

    }
    public static void main(String[] args) {
        StaticInnerClass.B sb=new StaticInnerClass.B();
        System.out.println(sb.x);
        sb.m2();
    }
}
