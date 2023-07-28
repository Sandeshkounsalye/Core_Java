package ImportantPrograms.Numbers;

public class FibonacciSeries {
    public static void main(String[] args) {

        //0,1,1,2,3,5,8,13,21,.........

        int num1=0;
        int num2=1;
        int number=10;
        int result;

        for (int i = 0; i <= number; i++) {
            result=num1+num2;
            num1=num2;
            num2=result;
            System.out.print(result+" ");
        }
    }
}
