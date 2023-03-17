package ClassComponent;

public class MethodDemo {
    //Instance Method
    int c=400;
    //Instance Method
    void m1(){
        int a=100;


        System.out.println("ADDITION - "+(a+c));
        System.out.println(c);
        System.out.println("Instance Method ");
    }
    //Static Method
    static void m2(){

        int b=200;
        System.out.println("Static Method");
        System.out.println(b);
    }

    public static void main(String[] args) {
        MethodDemo md= new MethodDemo();
        //Instance Method
        md.m1();
        System.out.println("---");
        System.out.println();

        //Static Method
        MethodDemo.m2();
       // System.out.println(b);


    }
}
