package replit;

import java.util.Arrays;
import java.util.Comparator;

public class Repl221A {
    public static void main(String[] args) {
        String s = "Today is the happiest day of my life";
        String longest = Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);
    }
}
