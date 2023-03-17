package method;

import java.util.Scanner;

public class Grade {

    private void   grading(int a){

        if (a <=100 && a>=90){
            System.out.println("AA Grade");
        } else if (a<=90 && a>=81) {
            System.out.println("AB Grade");

        } else if (a<=80 && a>=71) {
            System.out.println("BB Grade");

        } else if (a<=70 && a>=61) {
            System.out.println("BC Grade");

        } else if (a<=60 && a>=51) {
            System.out.println("CD Grade");

        } else if (a<=50 && a>=41) {
            System.out.println("DD Grade");

        } else if (a<=40) {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks :");
        int a= sc.nextInt();
        Grade grade=new Grade();
        grade.grading(a);

    }
}
