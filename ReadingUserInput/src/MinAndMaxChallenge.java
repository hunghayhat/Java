import java.util.Scanner;
public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        do
            try {
            System.out.println("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if (number <= min) min = number;
            if (number >= max) max = number;
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);
        } catch (Exception e) {
            System.out.print(e);
            break;
        } while (1 > 0);

    }
}
