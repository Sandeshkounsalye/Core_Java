package Java_8_Features.StreamAPI.Sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
//        List<String> list1= Arrays.asList("Isha","Bob","Aditya","Deepak","Aditya");

        List<String> list1=new ArrayList<>();
        list1.add("Isha");
        list1.add("Bob");
        list1.add("Aditya");
        list1.add("Deepak");
        list1.add("Hardik");

        List<String> names=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(names); //ascending order

        List<String> names1=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(names1); //Reverse order
    }
}
