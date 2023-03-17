package ThisKeyWord;

public class This1 {
    int roll;
    int age;

    public This1(int roll, int age) {
        // here this key word is used to refer current instance variable
        this.roll = roll;
        this.age = age;
        System.out.println(roll+age);
    }
    public This1(){
        // here this key word is used to invoke current class constructor
        this(10,40);
    }
    void m1(){
        System.out.println("----***----");

    }
    void m2(){
        // here this key word is used to invoke current class method
        this.m1();
    }

    public static void main(String[] args) {
        This1 this1=new This1();
        this1.m2();
    }

}
