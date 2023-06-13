package Java_8_Features;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,7,2,1,6,3,4,5,7,6,8,4,0,1);

        list.stream().sorted().forEach(System.out::println);

        int a=5;
        int b=05;

        MaxAndMin m=new MaxAndMin();
        m.hashCode();




    }



//    Comparator<Integer> comparator=Comparator.comparing(Integer::intValue);



}
