package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashsetDemo {
    public static void main(String[] args) {
        Set integers=new LinkedHashSet();

        System.out.println(integers.add(10));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(null));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(11));
        System.out.println(integers.add(null));
        System.out.println(integers.add(19));
        System.out.println(integers.add(true));
        System.out.println(integers.add(true));

        System.out.println(integers);
        integers.remove(11);
        integers.add("HELLO");
        integers.forEach(System.out::println);
        System.out.println(integers);
        System.out.println(integers.contains(19));
        integers.clear();
        System.out.println(integers);
    }
}
