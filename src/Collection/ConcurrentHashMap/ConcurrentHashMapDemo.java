package Collection.ConcurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        map.put(4,400);
        map.put(5,500);

        Iterator <Integer> it=map.keySet().iterator();
        while(it.hasNext()){
            Integer key= it.next();
            System.out.println("Map value :"+map.get(key));

            if (key.equals(4)){
                map.put(6,600);
            }
        }

    }
}
