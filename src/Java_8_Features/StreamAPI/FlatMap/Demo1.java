package Java_8_Features.StreamAPI.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
//        FlatMap - it used to collect the all collections
        List<Integer> list1= Arrays.asList(1,2,3);
        List<Integer> list2= Arrays.asList(4,5,6);
        List<Integer> list3= Arrays.asList(7,8,9);

        List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);

        List<Integer> result=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(result);

        List<Integer> result1=finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(result1);

    }
}
