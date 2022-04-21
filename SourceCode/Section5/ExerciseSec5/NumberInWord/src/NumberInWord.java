public class NumberInWord {

    public static void main(String[] args) {
	// write your code here
        // write a method called printNumberInWord, one para
//        printNumberInWord(1);
//        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ( (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        int temp = 0;
        if ( year > 9999 || year < 1 || month < 1 || month > 12) {
            temp = -1;
        } else {
            if (isLeapYear(year)==true) {
                // leap year
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        temp = 31;
                        break;
                    case 2:
                        temp = 29;
                        break;
                    default:
                        temp = 30;
                        break;
                }
            } else {
                // not leap year
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        temp = 31;
                        break;
                    case 2:
                        temp = 28;
                        break;
                    default:
                        temp = 30;
                        break;
                }
            }
        }
        return temp;
    }
}
