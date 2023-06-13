package Java_8_Features.OptionalClass;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String[] s=new String[5];

        s[0]="ram";
        s[1]="shyam";
        s[2]="om";

        System.out.println(s[1].length());
        System.out.println(s[2].length());
        System.out.println(s[4]);
        System.out.println(s[3].length()); //NullPointerException

        String str=null;
//        if (str==null){
//            System.out.println("null obj");
//        }
//        else {
//            System.out.println(str.length());
//        }

        Optional<String> optional=Optional.ofNullable(str);

        System.out.println(optional.isPresent());
        System.out.println(optional.get()); //NullPointerException
        System.out.println(optional.orElse("no value is this obj"));
        System.out.println(optional.hashCode());


    }
}
