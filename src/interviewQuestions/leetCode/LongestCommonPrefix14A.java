package interviewQuestions.leetCode;

import java.util.Arrays;

public class LongestCommonPrefix14A {

    public static String longestCommonPrefix(String[] strs) {
        //if strs is empty, return ""
        if (strs == null || strs.length == 0)
            return "";

        //sorting the array alphabetically
        Arrays.sort(strs);
        //setting first to the first word in the sorted array
        String first = strs[0];

        //setting last to the last word in the sorted array
        String last = strs[strs.length - 1];
        //setting c = 0
        int c = 0;
        //starting the while loop
        while(c < first.length()) {
            //comparing the charAt c for the first and last words
            if (first.charAt(c) == last.charAt(c))
                //if they match, increment c
                c++;
            //if they do not match, break the loop
            else
                break;
        }
        //if c==0, return "", since the loop did not increment and thus there is no common prefix
        //if c!=0, there is a common prefix. The sort function sorts arrays alphabetically, which means they will be
        //sorted by the initial common letters. The value of c after the loop is how far into the first and last word
        //still matches. The substring returns the String from 0 to c
        return c == 0 ? "" : first.substring(0, c);
    }

    public static void main(String[] args) {

        String[] arr = {"dog","racecar","car"};
        String[] arr1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr1));
        System.out.println(longestCommonPrefix(arr));
    }
}

