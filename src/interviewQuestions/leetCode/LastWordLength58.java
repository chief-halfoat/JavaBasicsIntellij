package interviewQuestions.leetCode;

/*Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/
public class LastWordLength58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWordA("Hello World"));
        System.out.println(lengthOfLastWordA("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int n = words[words.length - 1].length();
        return n;
    }

    public static int lengthOfLastWordA(String s) {
        //instantiating the length init
        int len = 0;
        //starting a loop to scan backwards from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            //checking if the char at the end is white space
            if (s.charAt(i) == ' ') {
                //if the len isn't 0, there has been some non-white space characters and therefore len
                // will be the length of the last word
                if (len != 0) {
                    //return the length of the last word
                    return len;
                }
                //if the length is still 0, move on
            } else {
                //if the char is not white space, increment the length
                len++;
            }
        }
        return len;
    }
}

