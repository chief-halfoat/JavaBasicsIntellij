package interviewQuestions.leetCode;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Example 1:
//Input: s = "()"
//Output: true
//Example 2:
//Input: s = "()[]{}"
//Output: true
//Example 3:
//Input: s = "(]"
//Output: false
public class ValidParanthese20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        //creating a new Stack with Character wrapper class
        Stack<Character> stack = new Stack<Character>();
        //looping through the String without an array by building the char[] in the loop
        for (char c : s.toCharArray()) {
            //if the char in the loop matches an opening symbol
            if (c == '(')
                stack.push(')');
                //it pushes the matching closing symbol into the stack
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            //checking if the stack is empty, meaning there were no opening characters
            //as the loop continues into what should be closing symbols, we pop out the top symbol that we got as the
                // match for the opener. If the closing symbols are in the right order/present, they will match the
                //popped symbol. The popped symbol is removed and the loop continues
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        //if the stack is emptied by matching closers in the correct order, the parantheses are valid
        return stack.isEmpty();

    }
}