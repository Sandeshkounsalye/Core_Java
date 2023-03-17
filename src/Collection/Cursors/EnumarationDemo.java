package Collection.Cursors;

import java.util.Vector;
import java.util.Enumeration;

public class EnumarationDemo {
    public static void main(String[] args) {
        Vector <Integer> vector=new Vector<>();
        vector.add(50);
        vector.add(20);
        vector.add(30);
        vector.add(10);
        vector.add(15);

//        for (Integer integer:vector){
//            if(integer%2==1){
//                vector.remove(integer);
//                System.out.println(integer);
//            }
//        }

        Enumeration<Integer> enumeration= vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        vector.removeElement(30);
        System.out.println(vector);

    }
}
