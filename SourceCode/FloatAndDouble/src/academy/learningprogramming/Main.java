package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // == 5.00 / 3.00
        // float myFloatValue2 = 5.25; > wrong as should be single precision
        float myFloatValueCorrect = (float) 5.25; // or float myFloatValueCorrect = 5.25f;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // challenge answer
        int pound = 150;
        double kilogram = 0.45359237 * pound;
        System.out.println(kilogram);

        // in class answer
        double numberOfPounds = 150;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double anotherNumber = 3_000_00.3_234_34d;
        System.out.println(anotherNumber);
    }
}
