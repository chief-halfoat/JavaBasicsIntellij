package replit;

public class Repl224Jose {
    public static void main(String[] args) {
//        System.out.println(removeConsecutiveDuplicates("aabbcde"));
//        System.out.println(removeConsecutiveDuplicates("aabbcc"));
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
        System.out.println(removeConsecutiveDuplicates(""));
    }
    public static String removeConsecutiveDuplicates(String input) {
        String str = new String();
        int len = input.length();
        for(int i=0;i<len;i++){
            char charr = input.charAt(i);
            int indexOf = str.indexOf(charr);
            if(indexOf<0){
                str+=charr;
            }
        }
        return str;
    }
}
