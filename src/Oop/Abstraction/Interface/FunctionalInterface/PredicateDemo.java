package Oop.Abstraction.Interface.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String str="Hello world";

        //Predicate check boolean
        //Predicate contain test method

        Predicate<String> checkLength=s -> s.length()>=5;
        System.out.println(checkLength.test(str));
        System.out.println(str.length());
    }
}
