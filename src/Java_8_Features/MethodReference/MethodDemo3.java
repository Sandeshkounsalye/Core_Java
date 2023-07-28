package Java_8_Features.MethodReference;

import java.util.function.BiFunction;

public class MethodDemo3 {
    public static int sum(int a,int b){
        return a+b;
    }
}

class test{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder=MethodDemo3::sum;
            int result=adder.apply(10,20);
        System.out.println(result);
    }
}
