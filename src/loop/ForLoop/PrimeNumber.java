package loop.ForLoop;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=89;
        boolean isPrime=true;
        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0){
                isPrime=false;
            }
        }
//        System.out.println(isPrime?"Is Prime":"Not prime");
        if (isPrime==true)
            System.out.println("Is Prime");
        else
            System.out.println("Not Prime");
    }
}
