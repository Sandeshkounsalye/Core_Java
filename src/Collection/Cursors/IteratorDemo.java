package Collection.Cursors;

import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(51);
        vector.add(60);
        vector.add(89);


//        //ConcurrentModificationException
//        for(Integer integer:vector){
//            if(integer%2==1){
//                vector.remove(integer);
//            }
//            System.out.println(integer);
//        }
        Iterator iterator=vector.iterator();
        while(iterator.hasNext()){
            Integer integer= (Integer) iterator.next();
            if (integer%2==0){
                iterator.remove();
                 System.out.println(integer);
            }
        }
    }
}
