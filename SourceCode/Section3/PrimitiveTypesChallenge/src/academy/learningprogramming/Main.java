package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        byte varByte = 5;
        short varShort = 55;
        int varInt = 555;

        // long varL = 50000 + 10 * (varI + varS + varB); >> wrong, should add L after 50000
        long varLongTotal = 50000L + 10L * (varInt + varShort + varByte);
        System.out.println(varLongTotal);

        short varShortTotal = (short) (1000 + 10 *
                (varInt + varShort + varByte));
        System.out.println(varShortTotal);
    }
}
