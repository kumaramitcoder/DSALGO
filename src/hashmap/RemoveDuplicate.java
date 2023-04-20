package hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer > list = new ArrayList<>();
        list.add(24);
        list.add(33);
        list.add(45);
        list.add(54);
        list.add(24);

        System.out.println(list);

        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer i : list){
            hashSet.add(i);
        }
        System.out.println(hashSet);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer i : list){
            arrayList.add(i);
        }
        System.out.println(arrayList);

//        List<String > list1 = new ArrayList<>();
//        list1.add("Amit");
//        list1.add("Amit");
//        list1.add("kumar");
//        list1.add("Kumar");
//
//
//        System.out.println(list);
//
//        HashSet<String> hashSet1 = new HashSet<>();
//        for (String s: list){
//            hashSet1.add(i);
//        }


    }
}
