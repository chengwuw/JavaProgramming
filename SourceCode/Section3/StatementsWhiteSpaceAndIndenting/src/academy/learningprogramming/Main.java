package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; // entire line is the statement, myXX = 50 is the expression
        // statement can be assignment
        myVariable++;
        myVariable--;
        System.out.println("This is a test"); // statement - semicolon

        System.out.println("This is" +
                " another" +
                " still more");
        // can be one line
        int anotherVariable = 50;myVariable--;System.out.println("This is another one");
        // 50 is literal value
        // indentation does not matter in Java



        // Code Blocks And the If Then
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was 1000 - 5000");
        } else if (score < 1000) {
            System.out.println( "Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus); // finalScore will be deleted outside if statement
            finalScore += 1000;
            // can not access the variable of finalScore outside the code block
            // >> accessibility
            System.out.println("Your final score was " + finalScore);
        }
// shortcuts for comment : ctrl + /
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver == true) {
//            int finalScore = newScore + (newLevelCompleted * newBonus); // finalScore will be deleted outside if statement
//            // can not access the variable of finalScore outside the code block
//            // >> accessibility
//            System.out.println("Your final score was " + finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }


    }
}
