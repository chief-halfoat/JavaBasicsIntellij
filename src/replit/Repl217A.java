package replit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repl217A {
//Complete countDuplicates method
// This method should count how many numbers are appearing more than once and should return the count.
//
//Input [12,12,13,45,78,7,7] output 2
//Input [12,12,7,7,7,7,7] output 2
//Input [12,120,13,45,78,17,57] output 0
//Input [12,12,13,45,78,67,87] output 1

    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(12);
        numbers1.add(12);
        numbers1.add(7);
        numbers1.add(7);
        numbers1.add(7);
        numbers1.add(7);
        numbers1.add(7);
        System.out.println(countDuplicates(numbers1));
    }

    static int countDuplicates(List<Integer> numbers) {
        Set<Integer> dups = new HashSet<>(numbers);
        int diff = (dups.size()-numbers.size())*-1;
        return diff;
        }

}