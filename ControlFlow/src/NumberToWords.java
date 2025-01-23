public class NumberToWords {
    public static void NumberToWords(int number) {
//        if (number < 0) System.out.println("Invalid Value");
//        else
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int reverse(int number) {
        if (number > 0 && number <= 9) return number;
        else {
            int reverse_number = 0;
            while (number / 10 > 0) {
                reverse_number = reverse_number * 10 + number % 10;
                number /= 10;
            }
            return reverse_number;
        }
    }

    public static void main(String[] args) {
        System.out.print(getDigitCount(98709238));
    }
}