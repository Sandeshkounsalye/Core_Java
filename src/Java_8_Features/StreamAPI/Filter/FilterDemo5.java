package Java_8_Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo5 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,20,30,40,50,11,89,35);

        List<Integer> list3=list.stream().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println(list3);


    }




}
