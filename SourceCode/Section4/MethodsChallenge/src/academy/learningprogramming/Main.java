package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // create a method called displayHighScorePosition
        // it should a players name as a parameter and a 2nd parameter as position in the high score table
        // display message like " managed to get into position " and the position they got and a furhter
        // message " on the high score table"

        // create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only - the player score
        // should return an int
        // 1 if score > 1000
        // 2 500-1000
        // 3 100 -500
        // 4 in all other cases

        int playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition("P1", playerScore);
        playerScore = calculateHighScorePosition(900);
        displayHighScorePosition("P2", playerScore);
        playerScore = calculateHighScorePosition(400);
        displayHighScorePosition("P3", playerScore);
        playerScore = calculateHighScorePosition(50);
        displayHighScorePosition("P4", playerScore);
        playerScore = calculateHighScorePosition(1000);
        displayHighScorePosition("P5", playerScore);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        }
//        else if (score >= 500) {
//            return 2;
//        }
//        else if (score >= 100) {
//            return 3;
//        }
//        else return 4; // = return 4;

        //another methods
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        }
        return position;
    }
}
