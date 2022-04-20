package outside.practice;

import java.util.Arrays;
import java.util.Locale;

public class AnagramTester {
    public static void main(String[] args) {
//        System.out.println(isAnagram("Listen","sil ent"));
        System.out.println(iAnagram("Listen","sil ent"));
//        System.out.println(checkAnagram("Listen","sil ent"));


    }

    public static boolean isAnagram(String input, String anagram){
       input=input.replace(" ","").toLowerCase();
       anagram=anagram.replace(" ","").toLowerCase();
       if(input.length()!=anagram.length()){
           return false;
       }
       char[] chars = input.toCharArray();
       for(char c:chars){
           int index = anagram.indexOf(c);
           if(index!=-1){
               anagram=anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
           } else{
               return false;
           }
       }
       return anagram.isEmpty();
    }

    public static boolean iAnagram(String input, String anagram){
        //removing spaces from input and possible anagram
        input=input.toLowerCase().replace(" ","");
        anagram=anagram.toLowerCase().replace(" ","");
        //putting the chars from input and anagram into CharArrays
        char[] charFromInput=input.toCharArray();
        char[] charFromAnagram=anagram.toCharArray();
        //sorting the CharArrays in alphabetical order
        Arrays.sort(charFromInput);
        Arrays.sort(charFromAnagram);
        //comparing the sorted CharArrays. If they match, it's an anagram
        return Arrays.equals(charFromInput,charFromAnagram);
    }

    public static boolean checkAnagram(String first, String second){
        first=first.toLowerCase().replace(" ","");
        second=second.toLowerCase().replace(" ","");
        //putting the input String into a CharArray
        char[] characters = first.toCharArray();
        //putting the possible anagram into a SB
        StringBuilder sbSecond = new StringBuilder(second);

        //using an enhanced for-loop to iterate through the chars of the input
        for(char ch:characters){
            //assigning an int to look for the index of the char in the loop
            int index = sbSecond.indexOf(""+ch);
            //if the char isn't present, it will have an index of -1. If the index
            //of the char is NOT -1, that means it is present.
            if(index!=-1){
                //if the char is present, it is deleted from the possible anagram
                sbSecond.deleteCharAt(index);
            } else {
                //if the index is -1, it is not present and therefore not an anagram
                return false;
            }
        }
        //the remaining length of the possible anagram is checked. If it is 0, then
        //it is an anagram
        return sbSecond.length()==0?true:false;
    }
}
