package outside.practice;

public class RollDie {
    public static void main(String[] args) {


        int die;   // The number on the die.
        die = (int) (Math.random()*6+1);
        System.out.println(die);
    }
}