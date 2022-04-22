package interviewQuestions;
//Let's create a game where we roll a die, and move a player around a game board.
//The board has 40 spaces, arranged in a circle
//
//The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
//- roll the die (each die has a random value, 1-6)
//- print player start position, die value, and ending position

import java.util.Random;

public class BoardGames {
    public static void main(String[] args) {
        rollBoardGame(30);

    }
    public static void rollBoardGame(int numberOfRolls){
        int start=0, roll, end;
        for(int i=0; i<numberOfRolls; i++){
            Random random = new Random();
            roll = random.nextInt(6)+1;
            start%=40;
            end=(start+roll);
            end%=40;
            System.out.println("Start: "+start+" Roll: "+roll+" End: "+end);
            start=end;
        }
    }
}
