package outside.practice;
//Write a Java program to check if a given number is prime or not.
// Remember, a prime number is a number which is not divisible by any other number,
// e.g. 3, 5, 7, 11, 13, 17, etc.
// Be prepared for cross, e.g. checking till the square root of a number, etc.
public class Primes {
    public static void main(String[] args) {
        for(int j=0;j<=20;j++){
            System.out.println(j+" : "+PrimeChecker.isPrime(j)+" : "+ PrimeChecker.PrimeCheckerAlt.isPrimeOrNot(j));
        }
    }
}

class PrimeChecker{
    public static boolean isPrime(int input){
        int sqrt = (int)Math.sqrt(input)+1;
        for (int i = 2; i <sqrt ; i++) {
            if(input%i==0){
                return  false;
            }
        }
        return  true;
    }
class PrimeCheckerAlt{
        public static String isPrimeOrNot(int num){
            if(num<0){
                return "not valid";
            }
            if(num==0||num==1){
                return "not prime";
            }
            if (num == 2 || num == 3) {
                return "prime number";
            }
            if ((num*num-1)%24==0){
                return "prime number";
            } else {
                return "not prime";
            }
        }
    }
}

