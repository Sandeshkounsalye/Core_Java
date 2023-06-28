package ImportantPrograms;

public class Factorial {
    //5!=5*4*3*2*1 = 120
    public static void main(String[] args) {

        int fact=1;
        int number=5;

        for (int i = 1; i <= number; i++) {
            fact=fact*i;
        }
        System.out.println("5 Factorial is :  "+fact);

    }
}
