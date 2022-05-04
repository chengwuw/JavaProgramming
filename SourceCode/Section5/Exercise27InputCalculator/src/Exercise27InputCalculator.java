import java.util.Scanner;

public class Exercise27InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long avg = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                avg = Math.round((double) sum / (double)counter);

            } else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
