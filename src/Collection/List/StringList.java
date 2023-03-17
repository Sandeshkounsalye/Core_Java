package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add(".Net");
        stringList.add("Csharp");
        stringList.add("CSS");
        stringList.add("Html");

        for (int index = 0; index <stringList.size() ; index++) {
            System.out.println(stringList.get(index));
        }
        System.out.println("****For Each *****");
        for (String str:stringList) {
            System.out.println(str);
        }
        //java 8 way
         stringList.forEach(System.out::println);//Method Reference

        //sorting

        System.out.println("After Sorting_____");
        Collections.sort(stringList);
        stringList.forEach(System.out::println);

    }
}
