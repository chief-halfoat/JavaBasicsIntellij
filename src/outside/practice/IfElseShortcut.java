package outside.practice;

public class IfElseShortcut {
    public static void main(String[] args) {
        int n1=5;

        String msg = n1>10? "Number is greater than 10":"Number is less than 10";
        System.out.println(msg);

        n1=11;
        msg = n1>10? "Number is greater than 10":"Number is less than 10";
        System.out.println(msg);

        String name = "John";
        String ans = name.equalsIgnoreCase("john")?"Hi John!":"What's your name?";
        System.out.println(ans);
    }
}
