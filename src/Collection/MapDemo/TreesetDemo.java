package Collection.MapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreesetDemo {
    public static void main(String[] args) {
        Map<Character,Integer> map=new TreeMap();
        map.put('a',10);
        map.put('w',15);
        map.put('d',14);
        map.put('c',32);
        map.put('o',17);
        map.put('l',66);

        System.out.println(map.keySet());

    }
}
