package ClassComponent;

public class MethodDemo1 {
    public String name;
    public  int roll;

    void m1(String empName,int empRoll){
        name=empName;
        roll=empRoll;
    }

    public void m2(){
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        MethodDemo1 methodDemo=new MethodDemo1();
        methodDemo.m1("sandesh",201);
        methodDemo.m2();
    }
}
