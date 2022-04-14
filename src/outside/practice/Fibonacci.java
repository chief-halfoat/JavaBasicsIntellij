package outside.practice;
//Write a simple Java program which will print Fibonacci series,
// e.g. 1 1 2 3 5 8 13 ... . up to a given number.
// We prepare for cross questions like using iteration over recursion
// and how to optimize the solution using caching and memoization.
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2=1, n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i < 10; i++) {
            n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
