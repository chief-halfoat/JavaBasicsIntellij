package outside.practice;

public class GreatestCommonDenominator {
    public static void main(String[] args) {

        System.out.println(gcd(54,24));
    }

    public static int gcd (int n1, int n2){
        if(n2==0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }
}
