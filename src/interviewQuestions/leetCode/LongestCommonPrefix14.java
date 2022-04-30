package interviewQuestions.leetCode;
//14. Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

import java.util.ArrayList;
import java.util.Arrays;

//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        //checking if any Strings are null or if the array is empty
        if(strs == null || strs.length == 0)    return "";
        //instantiating the return String and setting it equal to the first String in the Array
        String pre = strs[0];
        //setting i to 1, because the first word is already stored in the String pre
        int i = 1;
        //starting a while loop that is less than the length of the String[]
        while(i < strs.length){
            //checking that the word being checked does not equal the first word
            while(strs[i].indexOf(pre) != 0)
                //removing the last letter from the comparison string
                pre = pre.substring(0,pre.length()-1);
            //if the words match, increment i
            //this loops until the words dwindling word has an indexOf==0, which means that is the extent of the common prefix
            //or the dwindling word is completely deleted and therefore there is no common prefix
            i++;
        }
        return pre;
    }
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        String[] arr1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr1));
        System.out.println(longestCommonPrefix(arr));
    }
}
