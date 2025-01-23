public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        int sum = 1;
        if (number < 1) return false;
        else {
            for (int i = 2; i < number; i ++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(isPerfectNumber(6));
    }
}