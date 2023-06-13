package Operators1;

import java.util.HashMap;

public class Or {
    public static void main(String[] args) {

        int a=10;
        int b=5;
        int c=20;

        System.out.println(a>b|a++<c | a++<c); //true
        System.out.println(a); //10

        System.out.println("---------------");

        System.out.println(a<b & a++<c); //false
        System.out.println(a); //10

        System.out.println(a>b && a++>c);
        System.out.println(a);

        System.out.println(a<b || a++<c);
        System.out.println(a);

        HashMap<Integer,String> map=new HashMap<>();
        map.put(10,"abc");
        map.put(20,"xyz");
        map.put(30,"pqr");
        map.put(30,"abc");
        map.put(40,"mxc");

        System.out.println(map);

    }
}
