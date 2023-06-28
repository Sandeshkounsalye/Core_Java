public class SingletonDemo {
    private  static SingletonDemo singletonDemo=null;

    public SingletonDemo(){
    }

    //constructor private
    public static SingletonDemo getInstance() {
        if (singletonDemo==null){
            singletonDemo=new SingletonDemo();
        }
        return singletonDemo;
    }

    public static void main(String[] args) {
        SingletonDemo s1=SingletonDemo.getInstance();
        System.out.println(s1.hashCode());

        SingletonDemo s2=SingletonDemo.getInstance();
        System.out.println(s2.hashCode());
    }
}
