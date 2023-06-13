package Java_8_Features.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","truck","car","bicycle","train");

        List<String> v=new ArrayList<>();
        v.add("bus");
        v.add("truck");
        v.add("car");
        v.add("train");

//        for (String name:vehicles){
//            System.out.print(name.length()+"\t");
//        }
//        vehicles.stream().map(name->name.length()).forEach(len-> System.out.println(len));
        vehicles.stream().map(name->name.length()).forEach(System.out::println);

        v.stream().map(name->name.length()).forEach(System.out::print);

    }
}
