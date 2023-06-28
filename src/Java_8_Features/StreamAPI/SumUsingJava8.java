package Java_8_Features.StreamAPI;

import java.util.Arrays;

public class SumUsingJava8 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int sum= Arrays.stream(a).sum();
        System.out.println(sum);
    }
}
