package Collection.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"sandesh");
        map1.put(2,"raju");
        map1.put(16,"Yash");
        map1.put(36,"suraj");

        System.out.println(map1.size());
        //cheak 16 is available in map
        System.out.println(map1.containsKey(16));
        //replace value
        map1.replace(2,"Raj");
        System.out.println(map1.get(2));
        System.out.println("----------");

        Set<Integer> keySets=map1.keySet();
        System.out.println(keySets);
        Iterator<Integer> itr=keySets.iterator();

        while (itr.hasNext()){
//            System.out.println(itr.hasNext());
            int key = itr.next();
            String value = map1.get(key);
            System.out.println(key+" "+value);
        }

//        System.out.println(map1);
    }
}
