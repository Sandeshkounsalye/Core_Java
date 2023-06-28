package Java_8_Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,7,2,1,6,3,4,5,7,6,8,4,0,1);

        list.stream().sorted().forEach(System.out::println);

        int a=5;
        int b=05;

        MaxAndMin m=new MaxAndMin();
        m.hashCode();

        Set<Integer> list2=new HashSet<>(list);
        list2.stream().forEach(System.out::println);

        list.stream().distinct().collect(Collectors.toList());



    }



//    Comparator<Integer> comparator=Comparator.comparing(Integer::intValue);



}
