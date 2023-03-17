package Oop.Abstraction.Interface.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        //function is also an FI
        //It contains apply();

        Function <Integer,Integer> square=i -> i*i;
        System.out.println(square.apply(10));
    }
}
