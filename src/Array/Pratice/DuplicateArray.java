package Array.Pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,50,90,110,10,50,60,10,90,110};

        // Brute Force Method
        System.out.println("Brute Force Method");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element :"+ arr[i]);
                }
            }
        }

        //Hash Set
        System.out.println("Hash Set");
        HashSet<Integer> set=new HashSet<Integer>();

        for (int element: arr) {
                if( set.add(element)){
                    System.out.print(element+" ");
                }
        }

        //Using Java 8 Stream
        System.out.println("");
        System.out.println("Using Java 8 Stream");
        Set<Integer> set1=new HashSet<>();

        Set<Integer> duplicate= Arrays.
                                       stream(arr).filter(i->!set1.add(i)).
                                       boxed().
                                       collect(Collectors.toSet());
        System.out.println(duplicate);


    }
}
