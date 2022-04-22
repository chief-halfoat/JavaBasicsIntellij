package replit;

import java.util.ArrayList;
import java.util.List;

public class Rep219Anton {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> names = new ArrayList<>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johnny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");

        List<String> query = new ArrayList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");

        System.out.println(countOnlyPrefixes(names, query));
    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
    List<Integer> counterList = new ArrayList<>();
    int counter = 0;
    for (int i = 0; i < query.size(); i++) {
        for (int j = 0; j < names.size(); j++) {
            if (!query.get(i).equals(names.get(j)) && names.get(j).contains(query.get(i))) {
                counter++;
            }
        }
        counterList.add(counter);
        counter = 0;
    }
    return counterList;
}
}
