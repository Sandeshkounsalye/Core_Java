package Java_8_Features.StreamAPI.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50,60,70,80,90,100);

        list.parallelStream().collect(Collectors.toList()).forEach(System.out::println);

        List<String> list2=Arrays.asList("Java","php","c","c++","python","c#","R");

        List<String> list3=list2.stream().filter(n->n.length()<=3).collect(Collectors.toList());

        System.out.println(list3);

    }
}
