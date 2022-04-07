package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        // easy for read
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        calculateScore(true, 10000, 8, 200);

    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // void - mean nothing return
        // but if we want to return score, we need to change void to int
        // java auto create the parameters in the braces
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
//        else {
//            return -1;
//        }
        // same as
        return -1; // not execute if the gameOver is true > which return final score
        // - conventionally used to return an error, invalid value

    }
}
