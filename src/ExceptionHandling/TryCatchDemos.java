package ExceptionHandling;

public class TryCatchDemos {
    public static void main(String[] args) {

        //valid :    1-TCF  2-TC  3-TF  4-TCCF
        //Invalid :  1-T  2.F


        int num=100;
        try {
            int num2=num/0;
            System.out.println(num2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
