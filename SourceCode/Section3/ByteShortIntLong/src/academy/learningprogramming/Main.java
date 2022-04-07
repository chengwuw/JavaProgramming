package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Val = " + myMinByteValue);
        System.out.println("Byte Maximum Val = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Val = " + myMinShortValue);
        System.out.println("Short Maximum Val = " + myMaxShortValue);
        
        long myLongValue = 100L; // upper case of L 
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Val = " + myMinLongValue);
        System.out.println("Long Maximum Val = " + myMaxLongValue);

        // long bigLongLiteralValue = 2_147_483_647_22567; // integer number too large
        long bigLongLiteralValue = 2_147_483_647_22567L; // it works
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue/2);

        // byte myNewByteValue = (myMinByteValue / 2); >> wrong as myMinByteValue is defaulted to int instead of byte, error: incompatible types: possible lossy conversion from int to byte
        // casting Java
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2); // > advice: always use int
    }
}
