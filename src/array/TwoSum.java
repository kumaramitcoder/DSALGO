package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twosum(int[] num, int target) throws IllegalAccessException {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<num.length;i++){
            int complement = target-num[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(num[i], i);
        }
        throw new IllegalAccessException("No match Found");

    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Two Sum");
        int[] arr = {1,4,6,8,9,0,7,7};
        int target = 14;

        System.out.println("TWO SUM "+ Arrays.toString(twosum(arr, target)));

    }
}
