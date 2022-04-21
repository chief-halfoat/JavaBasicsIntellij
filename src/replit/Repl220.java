package replit;

public class Repl220 {  public static void main(String[] args) {
    System.out.println(formatString("00-44 48 555555"));
}
    public static String formatString(String S){
            //Using regex to remove everything but digits
        S=S.replaceAll("[^\\d]","");
            //removing the spaces
        S=S.replace(" ","");
            //creating a StringBuilder object
        StringBuilder str = new StringBuilder(S);
            //looping through the SB every 4 spaces
        for(int i=3;i<str.length();i+=4) {
            //inserting a - every 4th char, so between the 3rd and 4th numbers
            str.insert(i, "-");
        }
        //returning the Sb to a String
        return str.toString();
    }
}
