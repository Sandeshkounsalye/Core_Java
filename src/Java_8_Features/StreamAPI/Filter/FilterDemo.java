package Java_8_Features.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {

        //filter - for apply condition

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

        System.out.println("***********");

        List<Integer> list1= Arrays.asList(10,20,30,40,50);

        list1.stream().map(n->n/4).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("++++++++++++++++");

        list1.stream().filter(n->n>30).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~");

        //Stream.iterate(1,n->n+1).filter(e->e%5==0).limit(10).forEach(System.out::println);
    }
}
