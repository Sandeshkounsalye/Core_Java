package method;

import java.util.Scanner;

public class assignment1 {
     Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();
    int b= scanner.nextInt();
    int c= scanner.nextInt();

    void maximum(){
        if(a>b && a>c){
            System.out.println("A is maximum "+a);
        }
        else if (b>a && b>c) {
            System.out.println("b is maximum "+b);
        }
        else{
            System.out.println("c is maximum "+c);
        }

    }
   void minimum(){
       if(a<b && a<c){
           System.out.println("A is minimum "+a);
       }
       else if (b<a && b<c) {
           System.out.println("b is minimum "+b);
       }
       else{
           System.out.println("c is minimum "+c);
       }
    }

    public static void main(String[] args) {
        System.out.println("Enter a three no :");

        assignment1 assignment1=new assignment1();

        assignment1.maximum();
        assignment1.minimum();
 }

}
