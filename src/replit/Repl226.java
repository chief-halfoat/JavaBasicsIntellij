package replit;

public class Repl226 {
    public static void main(String[] args) {
        String str1="Syntax is Great";
        System.out.println(reverseString(str1));
    }

    public static String reverseString(String strToRev){
        //splitting the input string at the spaces
        String[] input = strToRev.split(" ");
        //creating an empty output String[] with a length equal to the input String[]
        String[] output = new String[input.length];
        //setting n to the length-1 for the last index of the String[]
        int n=input.length-1;
        //creating an enhanced for loop
        for(String string:input){
            //getting the String in the first position from the input and assigning to the last position of the output
            //decrementing the n value to change the index location
            output[n--]=string;
        }
        //creating a blank string
        String fin="";
        //looping
        for(String str:output){
            //adding the String at the index to the end of the string and adding a space
            fin+=str+" ";
        }
        //trimming the space
        fin.trim();
        return fin;
    }
}
