import java.util.Scanner;

public class ParsingValueFromStr {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString); // can only work on "2018" rather than "2018a"
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number2 = " + number2);

        numberAsString = "2018.125";
        number2 = Double.parseDouble(numberAsString);
        number2 += 1;
        System.out.println("number2 = " + number2);


    }
}
