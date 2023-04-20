package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyCharacter {

    public static void main(String[] args) {

       String str = "hello world";
       Map<Character, Integer> map = new HashMap<>();
       for (int i=0; i<str.length();i++){
           Character ch = str.charAt(i);
           map.put(ch, map.getOrDefault(ch,0)+1);
       }
        System.out.println(map);

    }
}
