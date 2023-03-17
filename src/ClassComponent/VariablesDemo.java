package ClassComponent;

public class VariablesDemo {
    //Instance Variable
    int a=10;
    int b=20;


    //Static Variable
    static  int c=50;


    public static void main(String[] args) {
        //Local Variable
        int d=60;

       //To access Instance Variable we need Reference
        VariablesDemo vd=new VariablesDemo();
        System.out.println("Instance Variable - "+vd.a);

        //Local variable can be access directly
        System.out.println("Local Variable - "+d);

        //Static Variable can be access with the class name
        System.out.println("Static Variable - "+VariablesDemo.c);


    }
}
