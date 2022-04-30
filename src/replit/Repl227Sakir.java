package replit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Repl227Sakir {
    public static String HTMLElements(String str) {
        LinkedList<String> open = new LinkedList<>();
        //        LinkedList<String> open=new LinkedList<>();
        List<String> openTags = Arrays.asList("b", "i", "em", "div", "p");

        List<String> closeTags = Arrays.asList("/b", "/i", "/em", "/div", "/p");

        String[] splits = str.split("[><]");

        for (int i = 0; i < splits.length; i++) {
            if (openTags.contains(splits[i])) {
                open.add(splits[i]);
            }
            if (closeTags.contains(splits[i])) {
                if (open.size() != 0) {
                    if (open.getLast().equals(splits[i].substring(1))) {
                        open.removeLast();
                    } else {
                        return open.getLast();
                    }
                }
            }
        }
        return "true";
    }
}
