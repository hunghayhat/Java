
// After 10 months
public class FirstLastDigitSum {
    // write code here
    public static int sumFirstAndLastDigit (int number) {
        int lastDigit = 0;
        if (number < 0) return -1;
        else if (number < 10) return 2*number;
        else {
            lastDigit = number % 10;
            while (number > 9) number /= 10;
            return number + lastDigit;
        }
    }
}
