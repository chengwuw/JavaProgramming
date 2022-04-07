package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        // primitive data type
        // byte -128~127
        // short
        // int common
        // long
        // float
        // double common
        // char
        // boolean common
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more."; // append string value
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastSting = "10";
        int myInt = 50;
        lastSting =lastSting + myInt;
        System.out.println("LastString is equal to " + lastSting);
        double doubleNumber = 120.47d;
        lastSting = lastSting + doubleNumber;
        System.out.println("LastString is equal to " + lastSting);

    }
}
