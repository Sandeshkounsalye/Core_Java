package Java_8_Features.StreamAPI.Sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(5);

        List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);//Ascending order

        List<Integer> sortedList1=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList1); //Reverse order

    }
}
