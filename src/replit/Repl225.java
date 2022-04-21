package replit;
//Reverse the number
//
//Input[123] ->output [321]
//Input[12345] ->output [54321]
//Input[1001] ->output [1001]
//Input[789] ->output [987]
public class Repl225 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(12345));
        System.out.println(reverseInteger(1001));
        System.out.println(reverseInteger(789));
    }

    public  static int reverseInteger(int N){
        //creating an object of the StringBuider class
        StringBuilder sb = new StringBuilder();
        //appending the value of N to the sb and turning the int into a String
        sb.append(N);
        //reversing the values
        sb.reverse();
        //returning the Sb to a String and converting that to an int
        int rev = Integer.valueOf(sb.toString());
        return rev;
    }
}
