public class DigitSumChallenge {
    public static int sumDigits (int number) {
        if (number < 0) return -1;
        else if (number <= 9) return number;
        else {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number/10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1008));
    }
}
