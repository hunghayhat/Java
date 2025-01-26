import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        while (1 > 0) {
            try {
                String input = scanner.nextLine();
                int number = Integer.parseInt(input);
                count++;
                sum += number;
            } catch (Exception e) {
                break;
            }
        }
        if (count == 0) System.out.println("SUM = " + sum + " AVG = " + count);
        else
        {
            avg = Math.round((double)sum/count);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}