

public class WhileStatement {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("________________________________");
        for (int i=1; i<7; i++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("________________________________");
        for (count=1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("________________________________");
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("________________________________");
        // do while: execute at least once
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);


        System.out.println("____________challenge_________________");
        int number = 4;
        int finishNumber = 20;

//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // jump back to the while condition
            } else {
                evenNumberFound++;
            }
            System.out.println("Even number " + number);
            if (evenNumberFound >= 5) {
                break; // jump to the end of the code
            }
        }
        System.out.println("Total number of even numbers is " + evenNumberFound);
    }


    public static boolean isEvenNumber(int number) {
        if (number %2 == 0) {
            return true;
        }
        return false;
    }


}
