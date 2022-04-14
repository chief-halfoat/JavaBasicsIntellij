package outside.practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
        System.out.println(factorialLoop(5));

    }

    public static int factorialRecursion(int n){
        if(n==0){
            return 1;
        }
        return n*factorialRecursion(n-1);
    }
    public static int factorialLoop(int n){
        int result = 1;
        while (n != 1) {
            result=result*n;
            n--;
        }
        return result;
    }
}
