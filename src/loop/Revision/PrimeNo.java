package loop.Revision;

public class PrimeNo {
    public static void main(String[] args) {
        int num=7;
        boolean isPrime=true;

        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0){
               isPrime=false;
               break;
            }
        }
        System.out.println(isPrime?"is Prime":"not Prime");
    }
}
