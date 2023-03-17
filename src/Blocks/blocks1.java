package Blocks;

public class blocks1 {

    //instance block
    {
        int agr=100;

        System.out.println("instance block");
    }

    //static block
    static {


        System.out.println("Static block ");
    }

    public static void main(String[] args) {
        blocks1 blocks1=new blocks1();
        blocks1 blocks2=new blocks1();
        blocks1 blocks3=new blocks1();
        blocks1 blocks4=new blocks1();


    }

}
