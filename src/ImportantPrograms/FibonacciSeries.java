package ImportantPrograms;

public class FibonacciSeries {

    //0,1,1,2,3,5,8,13,21,31,...........
    //sum of two numbers

    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int count=20;
        System.out.print(n1+" "+n2);
        for (int i = 0 ;i < count; i++) {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
}
