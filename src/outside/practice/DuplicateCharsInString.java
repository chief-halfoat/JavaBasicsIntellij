package outside.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        String a = "Programming", b="Combination", c="Java";
        printDuplicateChars(a);
        printDuplicateChars(b);
        printDuplicateChars(c);

    }

    public static void printDuplicateChars(String word){
        //assigning the chars to an array
        char[] characters = word.toCharArray();
        //creating a map to store the chars and the char count
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        //creating a loop to pull each char from the array
        for(Character ch:characters){
            //the loop takes a char and compares it to the Character in the map
            if(charMap.containsKey(ch)){
                //if the char is in the map, it uses the key(char) and gets the value of the Integer and adds 1, thus
                //incrementing the count
                charMap.put(ch, charMap.get(ch)+1);
            } else {
                //if the char is not in the map, the loop adds it and starts its count at 1
                charMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
