package loop.Revision;

public class SumOfFactors {

        public static void main(String[] strings){
            int number = 156;
            int sum = 0;
            for(int i =1; i <= number/2; i++) {
                if(number%i==0){
                    sum = sum + i;
                    System.out.println(i+ " is factor of "+number);
                }
            }
            System.out.println("Sum of factors of "+number+" is "+sum);

        }
    }

