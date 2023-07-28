package ImportantPrograms.Numbers;

public class PrimeNumber {
    public static void main(String[] args) {

        //2, 3, 5, 7, 11, 13, 17....

        int a=83;
        int temp=0;
        for (int i = 2; i <=a/2 ; i++) {
            if(a%i==0){
                temp=1;
                break;
            }
        }
        if(temp==1){
            System.out.println("Not Prime Prime Number");
        }
        else {
            System.out.println("Prime Number");
        }
    }
}

