package ClassObject;

public class main {
    public static void main(String[] args) {

        product pro=new product();
        product pro1=new product();

        pro.ProductCode=123;
        pro.ProductName="Asus 14";

        pro1.ProductCode=124;
        pro1.ProductName="Dell";


        System.out.println(pro.ProductCode);
        System.out.println(pro.ProductName);

        System.out.println(pro1.ProductName);
        System.out.println(pro1.ProductName);

    }
}
