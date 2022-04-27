package interviewQuestions.leetCode;
//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
//For example, 121 is a palindrome while 123 is not.
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// Follow up: Could you solve it without converting the integer to a string?
public class ReverseInt09 {
    public static boolean palindromeInt(int n){
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        String a = sb.toString();
        String b = sb.reverse().toString();
        return a.equals(b);
    }

    public static boolean palindromeIntNoString(int x){
        if(x<0||x>0&&x%10==0){
            return false;
        } else {
            int rev=0;
            while(x>rev){
                rev=rev*10+x%10;
                x=x/10;
            }
            return (x==rev||x==rev/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(palindromeInt(121));
        System.out.println(palindromeInt(123));
        System.out.println(palindromeIntNoString(121));
        System.out.println(palindromeIntNoString(123));
    }
}
