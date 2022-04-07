package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	    // expressions: variables, operators, operands
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        // control statement
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // challenge
        int score = 100;
        if (score > 99) {  // score > 99 is also the expression
            System.out.println("You got the high score!");
            score = 0;
        }

    }
}
