package Java_8_Features.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(9,8,5,6,4,2);
        List<Integer> multipliedList=new ArrayList<>();

//        for (int num:numberList){
//            //System.out.println(num*3);
//            multipliedList.add(num*3);
//        }
//        multipliedList.forEach(System.out::println);


//        multipliedList=numberList.stream().map(num->num*3).collect(Collectors.toList());
//        multipliedList.forEach(System.out::println);

        numberList.stream().map(num->num*3).forEach(System.out::println);

    }
}
