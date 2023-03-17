package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {

        Set <Integer>hashSet=new HashSet();

        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);

        hashSet.forEach(System.out::println);
//        System.out.println(hashSet);

    }
}
