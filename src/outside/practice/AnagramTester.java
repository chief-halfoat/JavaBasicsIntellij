package outside.practice;

import java.util.Arrays;
import java.util.Locale;

public class AnagramTester {
    public static void main(String[] args) {
        System.out.println(isAnagram("Listen","sil ent"));
        System.out.println(iAnagram("Listen","sil ent"));
        System.out.println(checkAnagram("Listen","sil ent"));


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
        input=input.toLowerCase().replace(" ","");
        anagram=anagram.toLowerCase().replace(" ","");
        char[] charFromInput=input.toCharArray();
        char[] charFromAnagram=anagram.toCharArray();
        Arrays.sort(charFromInput);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromInput,charFromAnagram);
    }

    public static boolean checkAnagram(String first, String second){
        first=first.toLowerCase().replace(" ","");
        second=second.toLowerCase().replace(" ","");
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);

        for(char ch:characters){
            int index = sbSecond.indexOf(""+ch);
            if(index!=-1){
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length()==0?true:false;
    }
}
