package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameter");
        }
        System.out.println("----------------------");
        calcFeetAndInchesToCentimeters(156);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) { // parameter is different
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() { // parameter is different
        System.out.println("no player name, no player score ");
        return 0;
    }



    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeter = 1;
        if ( (feet < 0) || (inches < 0) || (inches > 12) ) {
            centimeter = -1;
        }
        centimeter = (feet * 12) * 2.54; //(inches + calcFeetAndInchesToCentimeters(inches)) / 2.54 ;
        centimeter += inches * 2.54;
        System.out.println( "feet " + feet + " + inches " + inches + " = centimeter " + centimeter);
        return centimeter;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ( inches < 0 ) {
            return -1;
        }
        double feet = (int) inches / 12 ;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " remain");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);

    }
}
