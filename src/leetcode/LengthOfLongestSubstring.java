package leetcode;

import java.util.ArrayList;

public class LengthOfLongestSubstring {

    public static int Lols(String s){
        ArrayList<Character> arrayList = new ArrayList<>();

        int l=0 , r=0, max=0;
        while (r<s.length()){
            if (arrayList.contains(s.charAt(r))){
               while (arrayList.contains(s.charAt(r))){
                   arrayList.remove(0);
                   l++;
               }
            }

            arrayList.add(s.charAt(r));
            r++;
            max = Math.max(max, arrayList.size());
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("LengthOfLongestSubstring");

        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');

        System.out.println(Lols("amit"));
    }

}
