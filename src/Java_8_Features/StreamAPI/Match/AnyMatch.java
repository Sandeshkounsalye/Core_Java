package Java_8_Features.StreamAPI.Match;

import java.util.HashSet;
import java.util.Set;

public class AnyMatch {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("one Apple");
        fruits.add("one Mango");
        fruits.add("two guavas");
        fruits.add("three banana");
        fruits.add("more grapes");

        //Any match - if at lest one of matching then it will give true
        boolean available=fruits.stream().anyMatch(value-> {return value.startsWith("one");});
        System.out.println(available);


    }
}
