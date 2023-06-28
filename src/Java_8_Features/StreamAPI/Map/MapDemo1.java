package Java_8_Features.StreamAPI.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        //Without using Stream concept
        //map - is used for operation on collection
        List<String> vehicles= Arrays.asList("bus","car","bike","truck","train");

        List <String> vehiclesListinUppercase=new ArrayList<String>();
//        for (String name:vehicles) {
//            vehiclesListinUppercase.add(name.toUpperCase());
//        }
//        System.out.println(vehiclesListinUppercase);

        //Stream-map
        vehiclesListinUppercase=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListinUppercase);
    }
}
