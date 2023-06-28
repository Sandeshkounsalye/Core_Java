package ImportantPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SplitString {
    public static void main(String[] args) {

        String str="I am developer";
         String a []=str.split(" ");

//        for (int i = 0; i <= str.length()-1; i++) {
//            System.out.println(a[i]);
//        }


        //Given List = {1,2,3,1,2,4,5,6,6,7,8}
        List<Integer> list= Arrays.asList(1,2,3,1,2,4,5,6,6,7,8);
        Set<Integer> set=list.stream().collect(Collectors.toSet());

        List<Integer> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(set);





        int b=10;
        int c=20;
        System.out.println("b :"+b+"and  c :"+c );
        b=b+c;
        c=b-c;
        b=b-c;
        System.out.println("b :"+b+" and c:"+c);



    }
}
