package ClassComponent;

public class BlocksDemo {
    int b;
    //Every time Object Created then Instance block executive
    {
        int a=10;
        int b=20;
        System.out.println("Instance Block");
        System.out.println(b+a);
    }

    //Every time Program run Static block executive
    static {

        System.out.println("Static Block");
    }

    public static void main(String[] args) {

         BlocksDemo blocksDemo=new BlocksDemo();
         BlocksDemo blocksDemo1=new BlocksDemo();

    }
}