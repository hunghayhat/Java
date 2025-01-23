
public class NumbersToWords {

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int max = getDigitCount(number);
            int last;
            int reverseNumber = reverse(number);
            for (int i = 0; i < max; i++) {
                last = reverseNumber % 10;
                switch (last) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }
                reverseNumber /= 10;
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) return -1;
        else if (number == 0) return 1;
        else {
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }

    public static int reverse(int number) {
        if (number >= -9 && number <= 9) return number;
        else {
            int reverse_number = 0;
            while (number != 0) {
                reverse_number = reverse_number * 10 + number % 10;
                number /= 10;
            }
            return reverse_number;
        }
    }

    public static void main(String[] args) {
        numberToWords(1450);
    }
}