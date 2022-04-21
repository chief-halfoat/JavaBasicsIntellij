package replit;

import java.util.*;

//Find the largest even length word from a String if there are two words with same largest even length return the first one. if there are not even words return -1
//input ["find MaxLen Even"]
//output ["MaxLen"]
//input["I am very Good at Java"]
//output ["very"]
//input["I was"]
//output ["-1"]
public class Repl221 {
    public static void main(String[] args) {
        String s = "find MaxLen Even was";
        //splitting the string at the spaces
        String[] str = s.split(" ");
        //adding the split string into a LinkedList so I can maintain the order for equal length even words
        //iterating through to remove odd length words
        List<String> stringList = new ArrayList<>();
        for(String st:str){
            if(st.length()%2==0){
                stringList.add(st);
            }
        }
        Iterator<String> it = stringList.iterator();
        while(it.hasNext()){
            String pop = it.next();

            }
        }


//        Iterator<String> iterator = lLstr.iterator();
//        while(iterator.hasNext()){
//            String pop= iterator.next();
//            if(pop.length()%2!=0){
//                iterator.remove();
//            }
//        }
//
//        System.out.println(lLstr);

    public static String returnLargestEvenLengthWord(String s){
        String[] str = s.split(" ");
        LinkedList<String> lLstr = new LinkedList<String>(List.of(str));
        Collections.sort(lLstr, (a, b)->Integer.compare(a.length(), b.length()));
        return s;
    }
}
