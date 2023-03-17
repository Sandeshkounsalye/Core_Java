package method;

import java.util.Scanner;

public  class factorial {
    static void fact(int num){
        int ans=1;
        for (int i=1;i<=num;i++){
            ans=ans*i;

        }
            System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        factorial factorial=new factorial();
        fact(num);

    }
}
