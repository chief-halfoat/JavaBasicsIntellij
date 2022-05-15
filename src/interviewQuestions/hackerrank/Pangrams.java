package interviewQuestions.hackerrank;

import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        pangrams("We promptly judged antique ivory buckles for the next prize");
        pangrams("The quick brown fox jumps over the lazy dog");
        pangrams("We promptly judged antique ivory buckles for the prize");
    }
    public static String pangrams(String s) {
        // Write your code here
    String is = "pangram",not = "not pangram";
        Set<Character> letters = new HashSet<>();
        s=s.replace(" ","");
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }
//        System.out.println(letters.size());
//        System.out.println(letters);
    if(letters.size()==26){
        return is;
    }
    return not;
    }
}
