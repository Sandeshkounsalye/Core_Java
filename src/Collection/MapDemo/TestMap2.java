package Collection.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap2 {
    public static void main(String[] args) {

        Map<Integer,String> fruits=new HashMap<>();
        fruits.put(1,"Apple");
        fruits.put(20,"Banana");
        fruits.put(200,"Grapes");
        fruits.put(500,"Mango");
        fruits.put(05,"ABC");


        Set<Integer> keySet=fruits.keySet();
        Iterator<Integer> itr=keySet.iterator();

        while (itr.hasNext()){
            int key= itr.next();
            String values= fruits.get(key);
            if (values.startsWith("A")){
                System.out.println(key+" - "+values);
            }
        }


    }
}
