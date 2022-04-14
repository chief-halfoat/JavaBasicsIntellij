package outside.practice;

import java.util.Random;

//Let's create a game where we roll a die, and move a player around a game board.
//The board has 40 spaces, arranged in a circle
//
//The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
//- roll the die (each die has a random value, 1-6)
//- print player start position, die value, and ending position
//
//sample output:
//
//    //     start=0, roll=3, end=3
//    //     start=3, roll=2, end=5
//    //     ...
////     start=38, roll=6, end=4
public class BoardGame {
    public static void main(String[] args) {
        int startPosition = 0, roll = 0, endPosition = 0;
        Random random = new Random();
        for(int i=1;i<=30;i++){
            roll = random.nextInt(6)+1;
            if(startPosition+roll>=40){
                endPosition=(startPosition+roll)-40;
            } else {
                endPosition=startPosition+roll;
            }
            System.out.println("start="+startPosition+" roll="+roll+" end="+endPosition);
            startPosition=endPosition;
        }
    }
}
