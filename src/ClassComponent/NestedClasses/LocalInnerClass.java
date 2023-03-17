package ClassComponent.NestedClasses;

public class LocalInnerClass {
    void  m1(){
        class A{
            int w=20;
            void m2(){
                System.out.println("Local Inner Class");
            }
        }
        A a= new A();
        System.out.println(a.w);
        a.m2();
    }


    public static void main(String[] args) {
        LocalInnerClass lc=new LocalInnerClass();
        lc.m1();
    }
}
