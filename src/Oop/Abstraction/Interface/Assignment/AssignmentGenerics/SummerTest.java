package Oop.Abstraction.Interface.Assignment.AssignmentGenerics;

public class SummerTest {
    public static void main(String[] args) {

        Summer <Integer> summer=(num1,num2)->num1+num2;
        System.out.println(summer.addInt(10,20));

        Summer <Double> summer1=(num1,num2)->num1+num2;
        System.out.println(summer1.addInt(20.02,30.12));

        Summer <Float> summer2=(num1,num2)->num1+num2;
        System.out.println(summer2.addInt(305.1556F,404.125f));
    }
}
