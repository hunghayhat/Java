public class LargestPrime {
    // write code here
    public static int getLargestPrime (int number) {
        int max = 0;
        if (number < 2) return -1;
        else {
            for (int i = 2; i <= number; i += 1) {
                while (number % i == 0) {
                    max = i;
                    number /= i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print(getLargestPrime(21));
    }
}