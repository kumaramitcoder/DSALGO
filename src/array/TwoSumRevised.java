package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumRevised {

    public static int[] twosum(int[] num, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<num.length; i++){
            int complement = target-num[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(num[i], i);
        }

        return num;
    }


    public static void main(String[] args) throws IllegalAccessException {

        int[] arr = {1,4,5,9,3,4,5,7,8};
        int target = 12;
        System.out.println("Two Sum "+ Arrays.toString(twosum(arr,target)));

    }
}
