package replit;

import java.util.ArrayList;
import java.util.Arrays;

//Remove Consecutive duplicates Write the logic to remove only consecutive duplicates
//
//input ["aabbcde"]-> output["abcde"]
//
//input ["aabbcc"]-> output["abc"]
//
//input ["aabbcca"]-> output["abca"]
//
//input ["aabbccaddda"]-> output["abcada"]
public class Repl224 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String input = "aabbcde";
        String input2 = "aabbcca";
        String input3 = "aabbccaddda";
        System.out.println(removeConsecutiveDuplicates(input));
        System.out.println(removeConsecutiveDuplicates(input2));
        System.out.println(removeConsecutiveDuplicates(input3));
    }

    public static String removeConsecutiveDuplicates(String input) {
        //converting the string to a charArray
        char[] chars = input.toCharArray();
        //finding the length of the char[]
        int n=chars.length;
        //using j to store temp variable and rewrite string w/o dupes
        int j=0;
        //looping through the array
        for(int i=0;i<n;i++){
            //comparing [j] to [i]
            //if they are not equal, j increments and adds the [i] value to the string
            if(chars[j]!=chars[i]){
                j++;
                chars[j]=chars[i];
            }
        }
        //creates a string from the array
        input = String.valueOf(Arrays.copyOfRange(chars,0,j+1));
        return input;
    }
}
