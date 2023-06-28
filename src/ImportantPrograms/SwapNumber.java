package ImportantPrograms;

public class SwapNumber {
    //Swap 2 number without using third variable
    public static void main(String[] args) {
        int b=10;
        int c=20;
        System.out.println("b :"+b+"and  c :"+c );
        b=b+c; //30
        c=b-c; //10
        b=b-c; //20
        System.out.println(b);
        System.out.println("b :"+b+" and c:"+c);

        String str="Ram";
        String str1="Ram";
        String str2=new String("Ram");
        int a=10;
        System.out.println("======================");

        System.out.println(str==str1);
        System.out.println(str==str2);

        System.out.println("============================");
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));

        System.out.println("============================");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
