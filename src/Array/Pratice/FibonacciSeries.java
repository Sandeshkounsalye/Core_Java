package Array.Pratice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int firstNo=0;
        int secondNo=1;

        for (int i = 1; i <=n ; i++) {
            System.out.print(firstNo+" ");
            int nextNo=firstNo+secondNo;
            firstNo=secondNo;
            secondNo=nextNo;
        }
    }
}
