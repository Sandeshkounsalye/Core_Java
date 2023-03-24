package Java_8_Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        //filter null from collection
        List<String> words= Arrays.asList("Bat","Sky",null,"page","book",null ,"light");

        words.stream().filter(w->w!=null).collect(Collectors.toList()).forEach(System.out::println);

    }
}
