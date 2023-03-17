package method;

import java.util.Scanner;

public class perfectnum {
    int perfect(int num) {
        int sum = 0;
        int i;
        for (i = 1; i <= num; i++) {

            for (int j = 1; j < i ; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }
        return i;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        perfectnum perfectnum=new perfectnum();
        perfectnum.perfect(num);

    }
}
