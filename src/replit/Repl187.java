package replit;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl187 {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hi");
        arr.add("yo");
        arr.add("sup");
        arr.add("yolo");
        arr.add("boop");

        // arr.remove(4);
        // arr.remove(2);
        // arr.remove(0);

        Iterator<String> iter = arr.iterator();
        while(iter.hasNext()){
            if (iter.next().equals("hi")||iter.next().equals("sup")||iter.next().equals("boop")){
                iter.remove();
            }
        }
        // Iterator<String> iter2 = arr.iterator();
        // while(iter2.hasNext()){
        //   if (iter2.next().equals("sup")){
        //     iter2.remove();
        //   }
        // }
//        Iterator<String> iter3 = arr.iterator();
//        while(iter3.hasNext()){
//            if (iter3.next().equals("boop")){
//                iter3.remove();
//            }
//        }

        for(String word:arr){
            System.out.print(word+" ");
        }
    }

}

