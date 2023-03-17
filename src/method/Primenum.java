package method;

import java.util.Scanner;

public class Primenum {
    void prime(int num){
//       even odd
//        if (num%2==0){
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }
        int count=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                count++;
                break;
            }

        }
        if(count==0) {
            System.out.println(num+ " prime is number ");
        }
        else {
            System.out.println(num +" is not prime number ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num= sc.nextInt();

        Primenum primenum=new Primenum();
        primenum.prime(num);
    }
}
