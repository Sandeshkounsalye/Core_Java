package Oop.Abstraction.Interface.Assignment.Triangle;

public class TriangleArea implements Area<Double>{

    @Override
    public Double area(Double num) {
        return (0.5*num*num);
    }

    public static void main(String[] args) {
        Area <Double>ar=(num)-> 0.5*num*num;
        System.out.println(ar.area(5.00));

    }
}

