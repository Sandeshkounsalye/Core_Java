package Constructor;

public class demoMain {
    public static void main(String[] args) {
        Demo demo=new Demo(45,"Sandesh",24);
        System.out.println(demo.getName());
        System.out.println(demo.getAge());
        System.out.println(demo.getRollNumber());
    }
}
