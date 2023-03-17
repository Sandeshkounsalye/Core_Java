package ClassComponent.NestedClasses;

public class InnerClass {
    class a{
        int x=10;
        void m1(){
            System.out.println("Inner Class....!!!");
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();
        InnerClass.a ia=innerClass.new a();
        System.out.println(ia.x);
        ia.m1();

    }
}
