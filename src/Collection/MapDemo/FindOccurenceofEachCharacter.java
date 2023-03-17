package Collection.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenceofEachCharacter {
    public static void main(String[] args) {
        String str="jd college of engineering and management";
        str=str.trim().replace(" ","");

        Map<Character,Integer> charMap=new HashMap<>();

        for (char ch:str.toCharArray()){
            if(!charMap.containsKey(ch)){
                charMap.put(ch,1);
            }else {
                charMap.put(ch,charMap.get(ch)+1);
            }
        }

        System.out.println(charMap);
        System.out.println(str.length());
    }
}
