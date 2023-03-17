package method;

import java.util.Scanner;

public class Circle {



    double area(int radius){
       //area=3.14*radius*radius
        return 3.14*radius*radius ;
    }

    double circumference(int radius){
       //circumference=2*3.14*radius
        return 2*3.146*radius;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius of circle ");
        int radius=sc.nextInt();
        Circle circle=new Circle();

        System.out.println("Area of circle is :"+circle.area(radius));
        System.out.println("Circumference of circle is :"+ circle.circumference(radius));

    }
}
