package replit;

public class Repl228A {
    public static void main(String[] args) {
        System.out.println(countLastWordChar("Hello world!"));
    }
    public static int countLastWordChar(String str){
        str = str.replaceAll("[AZaz]","");
        String[] arr = str.split(" ");
        return arr[arr.length-1].length();
    }
}
