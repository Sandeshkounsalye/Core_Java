package Java_8_Features.StreamAPI.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sandesh","Mahesh","Ram","Kiran","Rajkumar");
        List<String> longName=new ArrayList<String>();

        longName=names.stream().filter(str->str.length()>6 && str.length()<9).collect(Collectors.toList());
        longName.forEach(System.out::println);


    }
}
