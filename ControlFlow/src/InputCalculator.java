import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int count = 0;
        int sum = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            count += 1;
            sum += scanner.nextInt();
        }

        if (count == 0) avg = 0;
        else avg = (long) Math.round(((double) sum) /count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
