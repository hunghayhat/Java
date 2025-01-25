import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int number;
        do {
            System.out.println("Enter number #" + (count + 1)+ ":");
            try {
                number = scanner.nextInt();
                count ++;
                sum += number;
            } catch (InputMismatchException e) {
                System.out.println(e);
                scanner.nextLine(); //Xóa bộ đệm
            }

        } while (count <5);
        System.out.print("Summary is: " +sum);
    }
}
