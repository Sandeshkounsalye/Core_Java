package Oop.Abstraction.Interface.Assignment.Triangle;

public class CircleArea implements Area<Double> {

    @Override
    public Double area(Double num) {
        return (3.14*num*num);
    }

    public static void main(String[] args) {
        Area <Double>a1=(num)->3.14*num*num;
        System.out.println(a1.area(5.00));
    }
}
