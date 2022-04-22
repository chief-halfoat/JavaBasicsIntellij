package replit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Find the largest even length word from a String if there are two words with same largest even length return the first one. if there are not even words return -1
//input ["find MaxLen Even"]
//output ["MaxLen"]
//input["I am very Good at Java"]
//output ["very"]
//input["I was"]
//output ["-1"]
public class Repl221B {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(findMaxLenEven("find MaxLen Even"));
        System.out.println(findMaxLenEven("I am very Good at Java"));
        System.out.println(findMaxLenEven("I was"));
    }
    public static String findMaxLenEven(String str) {
        //creating a Str[] by splitting the input at spaces
        String[] splitStr = str.split(" ");
        //creating a List to store the even-length words and maintain insertion order
        List<String> words = new ArrayList<>();
        //creating a loop to go through the split strings
        for(String split:splitStr){
            //if the String has an even length
            if (split.length()%2==0){
                //add it to the List
                words.add(split);
            }
        }
        String longestEven="";
        //instantiating a String to hold the value of the longest even-length string
        if(!words.isEmpty()){
            //checking if the List is empty, ie had no even length words
            //if the List isn't empty, assigning the longestEven String to the first word in the List
            longestEven = words.get(0);
            //looping through the words List
            for(String word:words){
                //if the word in the list is longer than the current longestEven...
            if(longestEven.length()<word.length()){
                //longestEven is reassigned to that word
                //List maintains insertion order, so the prompt to take the first word of equal length words is met
                longestEven=word;
            }
        }} else {
            //if the List is empty, assign longestEven to -1
            longestEven="-1";
        }
        //return the longest even-length word
        return longestEven;
    }
}
