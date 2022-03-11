package outside.practice;
public class VariableLengthParamets {
    public static int sum(int... numbers){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }
}

