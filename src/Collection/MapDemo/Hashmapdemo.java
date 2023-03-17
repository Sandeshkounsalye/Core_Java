package Collection.MapDemo;

import java.util.Map;
import java.util.HashMap;

public class Hashmapdemo {
    public static void main(String[] args) {

        Map map=new HashMap();
//        Map map=new TreeMap<>();


        map.put("B",20);
        map.put("F",60);
        map.put("I",90);
        map.put("C",30);
        map.put("G",70);
        map.put("E",50);
        map.put("A",10);
        map.put("H",80);
        map.put("D",40);


        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("H"));
        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
