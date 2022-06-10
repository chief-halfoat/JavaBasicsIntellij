package interviewQuestions.leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {

    public static boolean isAnagram(String s, String t) {

    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
        if(s.length()!=t.length()){
        return false;
    }
    Map<Character, Integer> mapA = new HashMap<>();
    Map<Character, Integer> mapB = new HashMap<>();
    for(int i=0;i<s.length();i++){
        mapA.put(a[i],mapA.getOrDefault(a[i],0)+1);
        mapB.put(b[i],mapB.getOrDefault(b[i],0)+1);
    }

    if(mapA.equals(mapB)){
        return true;
    }
    return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
