package replit;

import java.util.Arrays;
import java.util.Iterator;

public class Repl224A {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
    }

//    public static String removeConsecutiveDuplicates(String input) {
//        for(int i=0;i<input.length()-1;i++){
//            if(input.charAt(i)==input.charAt(i+1)){
//                input = input.substring(0,i)+input.substring(i+1);
//            }
//        }
//        return input;
//    }

    public static String removeConsecutiveDuplicates(String input) {
        char[] chars = input.toCharArray();
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (chars[j] != chars[i]) {
                j++;
                chars[j] = chars[i];
            }
        }
        input = String.valueOf(Arrays.copyOfRange(chars, 0, j + 1));
        return input;
    }
}
