package replit;

public class Repl228 {
    public static int countLastWordChar(String str){
        String[] arr = str.split(" ");
        return arr[arr.length-1].length();
    }
}
