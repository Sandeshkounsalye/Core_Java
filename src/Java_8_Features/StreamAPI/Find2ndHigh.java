package Java_8_Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find2ndHigh {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,5,6,6,7,9,1,3,5,8,7,10);
        List<Integer> list1=list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);


    }
}
