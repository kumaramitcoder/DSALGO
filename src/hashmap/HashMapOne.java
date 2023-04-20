package hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapOne {

    public static void main(String[] args) {
        System.out.println("HashMap");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 1200);
        map.put("China", 1800);
        map.put("Us", 1600);
        map.put("Uk", 1900);
        map.put("Paris", 1000);

        System.out.println(map);
        map.put("Seria",2300);
        map.put("India", 2500);

        System.out.println(map);

        System.out.println(map.containsKey("Seria"));

        System.out.println(map.get("Us"));



        Set<String> set = map.keySet();
        System.out.println(set);

        for (String key: map.keySet()){
            Integer val = map.get(key);
            System.out.println(key + "  "+ val);
        }



    }

}
