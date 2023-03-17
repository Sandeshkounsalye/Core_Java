package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(11);
        integerList.add(6);
        integerList.add(45);
        integerList.add(32);
        integerList.add(84);
        integerList.add(23);
        integerList.add(19);
        integerList.add(41);

        Collections.sort(integerList);
        integerList.forEach(System.out::println);

    }
}
