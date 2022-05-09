package replit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Repl227Sakir {


    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }

    public static String HTMLElements(String str) {
        //creating a linked list to store the opening tags in order
        LinkedList<String> open = new LinkedList<>();
        //creating a list of possible opening tags
        List<String> openTags = Arrays.asList("b", "i", "em", "div", "p");
        //creating a list of possible closing tags
        List<String> closeTags = Arrays.asList("/b", "/i", "/em", "/div", "/p");
        //creating a String[] of the provided String split at the ><
        String[] splits = str.split("[><]");
        //creating a loop that will loop through the tags in the String[] of splits
        for (int i = 0; i < splits.length; i++) {
            //if the current tag in the loop is contained in the openTags list
            if (openTags.contains(splits[i])) {
                //add the current tag to the open list
                open.add(splits[i]);
            }
            //if the current tag in the loop is contained in the closeTags list
            if (closeTags.contains(splits[i])) {
                //if the open list is NOT 0
                if (open.size() != 0) {
                    //if the last tag in the open list equals the current closing tag
                    if (open.getLast().equals(splits[i].substring(1))) {
                        //remove the last value in the open list
                        open.removeLast();
                        //else return the last value of open list
                    } else {
                        return open.getLast();
                    }
                }
            }
        }
        return "true";
    }
}
