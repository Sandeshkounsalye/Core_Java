package Csj28;

import java.util.HashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(1);
        set1.add(45);
        set1.add(367);

        Set<Integer> set2=new HashSet<>();
        set2.add(10);
        set2.add(12);
        set2.add(35);
        set2.add(336);

        //merging the two sets
//        set1.addAll(set2);
//        System.out.println(set1);

        //you can remove from the set
//        set1.removeAll(set2);
//        System.out.println(set1);

        //retain will give the common obj
        set1.retainAll(set2);
        System.out.println(set1);

    }
}
