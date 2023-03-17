package method;

public class Demo1 {
    //instance method
    void m1(){
        System.out.println("Good");
    }
    //static method
     static void m2(int a,int b){
        System.out.println("addition "+a*b);
        System.out.println("Morning");

    }

    public static void main(String[] args) {
        //object create
        Demo1 demo1=new Demo1();
        System.out.println("Hello");

        demo1.m1();
        m2(5,6);

    }
}
