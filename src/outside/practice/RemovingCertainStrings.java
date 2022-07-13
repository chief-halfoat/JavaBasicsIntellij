package outside.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovingCertainStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Apple");
        strings.add("Banana");
        strings.add("Apricot");
        strings.add("Chives");
        strings.add("Antelope");
        strings.add("Denim");
        strings.add("Eagle");
        strings.add("Aardvark");
        strings.add("Hose");
        strings.add("Jam");
        strings.add("ABlItY");
        strings.add("aBlItY");
        System.out.println(OnlyAWordsAndToLowercase(strings));
        System.out.println(OnlyAWordsAndToLowercaseIterator(strings));
    }
    public static List<String> OnlyAWordsAndToLowercase(List<String> stringList){
        List<String> ans = new ArrayList<>();
        for(String str:stringList){
            str=str.toLowerCase();
            if(str.startsWith("a")){
                ans.add(str);
            }

            }
        return ans;
    }
    public static List<String> OnlyAWordsAndToLowercaseIterator(List<String> stringList){
        Iterator<String> itr = stringList.iterator();


        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i,stringList.get(i).toLowerCase());
        }
        while(itr.hasNext()){
            String s = itr.next();
            if(!s.startsWith("a")){
                itr.remove();
            }
        }
        return stringList;
    }
}
