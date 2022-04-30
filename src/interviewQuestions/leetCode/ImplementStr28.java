package interviewQuestions.leetCode;

/*Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1*/
public class ImplementStr28 {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("aaaaa", ""));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public int strStrA(String haystack, String needle, int n) {
        if (needle.isEmpty())
            return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i + n - 1) == needle.charAt(n - 1)) { //extra validation
                for (int j = 0; j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); j++) {
                    if (j == needle.length() - 1)
                        return i;
                }
            }
        }
        return -1;
    }
}
