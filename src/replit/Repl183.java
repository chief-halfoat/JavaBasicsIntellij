package replit;

import com.syntax.class24.Parent;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl183 {

    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hi");
        arr.add("yo");
        arr.add("sup");
        arr.add("yolo");
        arr.add("boop");
        arr.add("hella");

        // arr.remove(4);
        // arr.remove(2);
        // arr.remove(0);

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("hi")) {
                iterator.remove();
            } else if (iterator.next().equals("sup")){
                    iterator.remove();
            }else if (iterator.next().equals("boop")){
                iterator.remove();
            }
        }
        System.out.println(arr);
    }
}

