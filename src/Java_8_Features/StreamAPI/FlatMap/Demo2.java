package Java_8_Features.StreamAPI.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA= Arrays.asList("Sandesh","Ram");
        List<String> teamB= Arrays.asList("Yogesh","Raju");
        List<String> teamC= Arrays.asList("Shubham","Om");

        List<List<String>> finalTeam=new  ArrayList<List<String>>();
        finalTeam.add(teamA);
        finalTeam.add(teamB);
        finalTeam.add(teamC);

        List<String> finalList=finalTeam.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
