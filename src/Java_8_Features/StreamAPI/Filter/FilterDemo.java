package Java_8_Features.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {

//        List<Integer> numberList=new ArrayList<>();
//        numberList.add(10);
//        numberList.add(14);
//        numberList.add(3);
//        numberList.add(19);
//        numberList.add(24);

        List<Integer> numberList= Arrays.asList(10,14,3,19,24,7);
        List<Integer> evenNumber=new ArrayList<>();

//        for (int n:numberList){
//            if (n%2==0)
//                evenNumber.add(n);
//        }
//        System.out.println(evenNumber);
//        evenNumber.forEach(System.out::println);

        evenNumber=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        evenNumber.forEach(System.out::println );

        //Here we are not collecting the data, direct printing(forEach)
        numberList.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
