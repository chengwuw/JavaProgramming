import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        Answer();
    }

    public static void myAnswer() {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid number. Please re-enter");
                scanner.nextLine();

            }

        }
        System.out.println("Sum of the ten input numbers is " + sum);
        scanner.close();
    }
    public static void Answer() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)

        }
        System.out.println("sum = " + sum );
        scanner.close();
    }
}


