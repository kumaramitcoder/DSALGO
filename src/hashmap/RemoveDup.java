package hashmap;

import java.util.*;

public class RemoveDup {

    public static void main(String[] args) {

        String sb = "Hello Hello Ab Ab";
        String[] arr = sb.split("");

        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i<sb.length();i++){
            set.add(arr[i]);
        }

        for (String ss: set){
            System.out.print(ss+"");
        }
        System.out.println();
    }

}
