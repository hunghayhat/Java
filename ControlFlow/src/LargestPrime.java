public class LargestPrime {
    public static int getLargestPrime(int number) {
        int max = 0;
        if (number <= 1) return -1;
        else {
            int temp = number;
            for (int i = 2; i <= number; i++) {
                while (temp % i == 0) {
                    max = i;
                    temp /= i;
                    continue;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.print(getLargestPrime(21));
    }
}