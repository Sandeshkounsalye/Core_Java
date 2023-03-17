package ClassComponent;

public class NestedclassesDemo {
    class inner{
        int a=10;
        static int m=20;
        void i(){
            System.out.println("Inner clas");
        }
    }
    static class staticBlock{
        int b=20;
        static int j=50;
        void s(){
            System.out.println("Static Block");
        }
    }
    void m1(){
        class LocaInner{
            int c=30;
            static int y=88;
            void l(){
                System.out.println("Local Inner Class");
            }
        }
    }

    public static void main(String[] args) {
        NestedclassesDemo b=new NestedclassesDemo();


        //Accessing the Inner Class

        NestedclassesDemo.inner bi=b.new inner();
        System.out.println(bi.a);
        bi.i();


        //Accessing the Static class
        NestedclassesDemo.staticBlock bd=new NestedclassesDemo.staticBlock();
        System.out.println(bd.b);
        bd.s();

        //Accessing the local inner


    }
}
