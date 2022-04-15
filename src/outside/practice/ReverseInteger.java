package outside.practice;

public class ReverseInteger {
    public static void main(String[] args) {

        for(int i=100; i<1000; i+=15){
            System.out.println(i+" : "+reverse(i));
        }

//        int num = 123;
//        System.out.println(reverse(num));
    }

    public static int reverse(int num) {
        int pop, reversed = 0;
        while (num != 0) {
            pop = num % 10;
            num /= 10;

            reversed = (reversed * 10) + pop;
        }
        return reversed;
    }
}
