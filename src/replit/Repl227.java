package replit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//HTML Elements
//
// Have the function HTMLElements (str) read the str parameter being passed
// which will be a string of HTML DOM elements and plain text.
// The elements that will be used are: b, i, em, div, p. For example:
//
//if str is < div>< b>< p>hello world< /p>< /b> < /div>
//then this string of DOM elements is nested correctly
// so your program should return the string true.
// If a string is not nested correctly, return the
// first element encountered where, if changed into a different element,
// would result in a properly formatted string. If the string is not formatted properly,
// then it will only be one element that needs to be changed.
//
// For example: if str is '< div> < i>hello< /i>world< /b>"
// then your program should return the string div because if the first < div> element were changed into a < b>,
// the string would be properly formatted.
//
//Examples Input: "< div>< div>< b>< /b>< /div>< /p>" Output: div
//Input: "< div>abc< /div>< p>< em>< i>test test test< /b>< /em>< /p>"
//Output: i
public class Repl227 {
    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
    public static String HTMLElements(String str){
        //creating a list to store the opening elements
        LinkedList<String> open=new LinkedList<>();
        //creating a list to store the closing elements
//        LinkedList<String> close=new LinkedList<>();
        //splitting the input string into an array based on the closing of one and opening of another element
        String[] splits = str.split("[><]");

        //looping through the split array
        for(String split:splits){
            //if the split contains one of the tags we're looking for, it adds the tag to the opening elements list
            if(split.equals("div")||split.equals("b")||split.equals("p")||split.equals("em")||split.equals("i")){
                open.add(split);
            }
            //checking if the split element contains a closing element
            if(split.equals("/div")||split.equals("/b")||split.equals("/p")||split.equals("/em")||split.equals("/i")){
                //if the open List is not empty
                if(open.size()!=0){
                    //get the value of the last element in the opening element list and assign it to a temp String
                    String openElem=open.getLast();
                    //if the last element in the opening elements list equals the first split element
                    if(openElem.equals(split.substring(1))){
                        //remove the last element
                        open.removeLast();
                    } else{
                        //if not, return the last element, since that is the one that needs changed
                        return open.getLast();
                    }
                }
            }
        }
        return "true";
    }
}
