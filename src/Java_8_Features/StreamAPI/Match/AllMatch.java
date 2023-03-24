package Java_8_Features.StreamAPI.Match;

import java.util.HashSet;
import java.util.Set;

public class AllMatch {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("one Apple");
        fruits.add("one Mango");
        fruits.add("two guavas");
        fruits.add("three banana");
        fruits.add("more grapes");

        //All match - All the values should matches then it will return true
        boolean result=fruits.stream().allMatch(value->{return value.startsWith("one");});
        System.out.println(result);
    }
}
