package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result % 3 ; // reminder
        System.out.println("20 % 3 = " + result);

        // abbreviating operators
        result++;
        System.out.println("2 + 1 = " + result);

        result--;
        System.out.println("3 - 1 = " + result);

        result += 2;
        System.out.println("2 + 2 = " + result);

        result *= 10;
        System.out.println("4 * 10 = " + result);

        result /= 4;
        System.out.println("40 / 4 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false; // assignment operator
        if (isAlien == true) // == : identical/equal to each other
            System.out.println("It is not an alien!"); // if statement only has this statement
        System.out.println("And I am scared of aliens."); // outside the if statement >> use code block to overcome

        if (isAlien == false) {
            System.out.println("It is not an alien2!");
            System.out.println("And I am scared of aliens2.");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore>90) || (secondTopScore <= 90) ) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        //if (isCar = true) { // >> isCar or isCar == false
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        // ternary operator
        boolean wasCar = (isCar) ? true : false; // isCar > condition, true > the value if condition is true; flase > the value if condition is false
        // equal to
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // challenge
        // create a double variable - 20
        double firstDoubleValue = 20d; // 20.00d
        double secondDoubleValue = 80d;
        double myValuesTotal = (firstDoubleValue + secondDoubleValue) * 100.00d;
        System.out.println("My value total = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder = " + theRemainder);
        boolean isRemainderZero = (theRemainder == 0) ? true : false;
        System.out.println("Output the boolean variable - isRemainderZero: " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some Remainder");
        }

    }
}
