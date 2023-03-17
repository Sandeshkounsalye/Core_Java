package loop;

public class A3 {
    public static void main(String[] args) {
//          *
//      *   *   *
//  *   *   *   *   *
//      *   *   *
//          *

        for (int i = 1; i <=5 ; i++) {
            if(i==2)
                continue;
            if (i==4)
                continue;
            for (int j = 1; j <=6-i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  "+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            if (i==1)
                continue;
            if(i==2)
                continue;
            if (i==4)
                continue;
            for (int j = 1; j <=i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("*  "+" ");
            }
            System.out.println();
        }
    }
}
