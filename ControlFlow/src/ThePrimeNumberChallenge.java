import java.lang.reflect.Array;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println(isPrime(127));
        Array a;
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count ++;
            }
            else continue;
            if (count == 3) break;
        }
    }

    public static  boolean isPrime (int wholeNumber) {
        if (wholeNumber < 2) return false;
        else {
            for (int i = 2; i <= wholeNumber/2; i++) {
                if (wholeNumber % i == 0) return false;
            }
        }
        return true;
    }

}
